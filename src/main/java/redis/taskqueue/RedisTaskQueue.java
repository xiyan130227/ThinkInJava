package redis.taskqueue;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedisTaskQueue {

    public static RedisTaskQueue redisTaskQueue = new RedisTaskQueue();

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);

//        redisTaskQueue.sendSoldEmailVialQueue(jedis, "seller", "item", 99.99, "buyer");
        redisTaskQueue.processSoldEmailQueue(jedis);
    }

    private void sendSoldEmailVialQueue(Jedis jedis, String seller, String item, double price, String buyer) {
        Map<String, Object> map = new HashMap<>();
        map.put("seller_id", seller);
        map.put("item_id", item);
        map.put("price_id", price);
        map.put("buyer_id", buyer);
        map.put("time", System.currentTimeMillis());
        String json = JSONObject.toJSONString(map);

        jedis.rpush("queue:email", json);
    }

    private void processSoldEmailQueue(Jedis jedis) {
        List<String> list = jedis.blpop(30000, "queue:email");
        for (String json : list) {
//            JSONObject jsonObject = JSONObject.parseObject(json);
//            fetchDataAndSendSoldEmail(JSONObject);

            System.out.println(json);
        }
    }


}
