import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
	ServerSocket serverSocket = null;
        try {
            final int PORT = 7777;
            serverSocket = new ServerSocket(PORT);
            System.out.println("The server is listening on port " + PORT);

            Socket socket = serverSocket.accept();

            BufferedReader in =
                new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
                );
            PrintWriter out =
                new PrintWriter(socket.getOutputStream(), true);

            String input;
            while ((input = in.readLine()) != null) {
                out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
		    System.exit(1);
                }
            }
        }
    }
}
