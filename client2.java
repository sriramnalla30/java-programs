import java.net.Socket;
import java.io.*;
                                  
public class client2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2708);
            System.out.println("Connected to server");
            BufferedReader sr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            try {
                while (true) {
                    String str = keyboard.readLine();
                    out.println(str);
                    if (str.equals("quit")) break;
                    String st = sr.readLine();
                    System.out.println("Server says: " + st);
                }
            } finally {
                out.close();
                sr.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
