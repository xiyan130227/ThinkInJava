package concurrency.highconcurrency.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket client = new Socket();
        PrintWriter writer = null;
        BufferedReader reader = null;

        try {
            client.connect(new InetSocketAddress("localhost", 8000));
            writer = new PrintWriter(client.getOutputStream(), true);
            writer.println("Hello");
            writer.flush();

            reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("from server: " + reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
                if (client != null)
                    client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
