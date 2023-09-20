import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients....");
            ServerSocket listener = new ServerSocket(2708);
            Socket client = listener.accept();
            System.out.println("Connection established:");
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader sr = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

            try {
                while (true) {
                    String str = sr.readLine();
                    System.out.println("Client says: " + str);
                    String response = kb.readLine();
                    out.println(response);
                    if (response.equals("quit")) break;
                }
            } finally {
                client.close();
                listener.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
