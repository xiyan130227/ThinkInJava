package rabbitmq.workfair;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import rabbitmq.util.ConnectionUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {

    private static final String QUEUE_NAME = "work_queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        Connection connection = ConnectionUtils.getConnection();

        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        int prefetchCount = 1;
        channel.basicQos(prefetchCount);

        for(int i = 0; i < 50; i ++) {
            String msg = "Hello " + i;

            System.out.println("Send msg: " + msg);

            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
            Thread.sleep(i * 20);
        }

        channel.close();
        connection.close();
    }
}
