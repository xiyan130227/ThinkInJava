package rabbitmq.workrobin;

import com.rabbitmq.client.*;
import rabbitmq.util.ConnectionUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Recv2 {

    private static final String QUEUE_NAME = "work_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = ConnectionUtils.getConnection();

        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body, "utf-8");

                System.out.println("-------------Recv2 msg: " + msg);

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("-----Recv2 done!");
                }
            }
        };

        boolean autoAck = true;
        channel.basicConsume(QUEUE_NAME, autoAck, consumer);
    }

}
