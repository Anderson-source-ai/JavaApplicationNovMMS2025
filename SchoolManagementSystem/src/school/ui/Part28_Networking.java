package school.ui;

import java.net.ServerSocket;

public class Part28_Networking {
    public void startServer() throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server running on port 5000...");
        server.close();
    }
}