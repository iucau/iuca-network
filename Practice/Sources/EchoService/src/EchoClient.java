import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            Scanner scanner = new Scanner(System.in);

            socket = new Socket("127.0.0.1", 7777);
            BufferedReader in =
                new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
                );
            PrintWriter out =
                new PrintWriter(socket.getOutputStream(), true);

            String input;
            while ((input = scanner.nextLine()) != null) {
                out.println(input);
                System.out.println("Server reply: " + in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
		    System.exit(1);
                }
            }
        }
    }
}
