package coder.lib.common.redis;

import redis.clients.jedis.JedisPool;

/**
 * Created by Pelin on 17/2/13.
 */
public interface RedisManager {

    JedisPool getPool();

    String set(String key, String value);

    String set(byte[] key, byte[] value);

    String get(String key);
}
