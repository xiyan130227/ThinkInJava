package redis.taskqueue;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTaskQueueTest {

    Jedis jedis = new Jedis("localhost", 6379);

    @Test
    public void sendSoldEmailVialQueue() {

    }
}