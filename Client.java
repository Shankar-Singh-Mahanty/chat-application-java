import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    Socket socket;
    BufferedReader br;
    PrintWriter out;

    // Constructor
    public Client()
    {
        try {
            System.out.println("Sending request to server.");
            socket = new Socket("127.0.0.1",7777);
            System.out.println("Conection Sucessful.");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startReading() {
        Runnable r1 = () -> {
            System.out.println("Reader started...");
            try {
                while (true) {
                    String msg = br.readLine();
                    if (msg == null || msg.equals("exit")) {
                        System.out.println("Server terminated the chat.");
                        socket.close(); // Close the socket
                        break;
                    }
                    System.out.println("Server: " + msg);
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        };
        new Thread(r1).start();
    }
    
    public void startWriting() {
        Runnable r2 = () -> {
            System.out.println("Writer started...");
            try {
                while (!socket.isClosed()) {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();
                    if (content.equals("exit")) {
                        socket.close(); // Close the socket
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        };
        new Thread(r2).start();
    }
    

    public static void main(String[] args) {
        System.out.println("I am Client.");
        new Client();
    }
}
