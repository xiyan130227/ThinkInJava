package rabbitmq.publishsubscribe;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import rabbitmq.util.ConnectionUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {

    private static final String EXCHANGE_NAME = "exchange_fanout";

    public static void main(String[] args) throws IOException, TimeoutException {

        Connection connection = ConnectionUtils.getConnection();

        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        int prefetchCount = 1;
        channel.basicQos(prefetchCount);

        String msg = "Hello publish_subscribe!";

        channel.basicPublish(EXCHANGE_NAME, "", null, msg.getBytes());
        System.out.println("Send: " + msg);

        channel.close();
        connection.close();

    }
}
