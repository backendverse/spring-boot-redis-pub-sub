package com.redis.pubsub.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NewsConsumer implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.info("Message consumed");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String body = new String(message.getBody());
        String channel = new String(message.getChannel());
        log.info("Received Message  With Channel: {} & Body : {}", channel, body);
    }
}
