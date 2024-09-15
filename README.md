# Chat Application in Java

## Overview
This repository contains a simple chat application implemented in Java. The application uses socket programming to establish a connection between a server and a client, allowing them to send and receive messages in real-time. It demonstrates the use of multithreading to handle simultaneous read and write operations.

## Features
- Real-time messaging between server and client
- Multithreaded handling of read and write operations
- Graceful handling of connection termination

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Basic understanding of Java and socket programming

### Running the Server
1. Open a terminal and navigate to the directory containing the `server.java` file.
2. Compile the `server.java` file:
   ```bash
   javac server.java
   ```
3. Run the server:
   ```bash
   java Server
   ```

### Running the Client
1. Open a new terminal and navigate to the directory containing the `client.java` file.
2. Compile the `client.java` file:
   ```bash
   javac client.java
   ```
3. Run the client:
   ```bash
   java Client
   ```

### How to Use
1. Start the server first.
2. Then, start the client.
3. Both server and client can now send and receive messages.
4. To terminate the chat, type `exit` in either the server or client console.

## Code Structure
- `Server.java`: Contains the server-side implementation.
- `Client.java`: Contains the client-side implementation.

## Contributing
Feel free to submit issues or pull requests if you have suggestions for improvements or additional features.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any questions or feedback, please reach out to [www.ssmahanty@gmail.com](mailto:www.ssmahanty@gmail.com).
```
# Happy Coding !
