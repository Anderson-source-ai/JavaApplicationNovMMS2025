package school.ui;

import java.net.ServerSocket;

public class Part28_Networking {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("School Server initialized on port 5000...");
        } catch (Exception e) {
            System.out.println("Network socket test completed.");
        }
    }
}