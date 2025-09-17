package com.redis.pubsub.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GenericLiveConsumer implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
       log.info("Pattern : {}", new String(pattern));
       log.info("Channel : {}", new String(message.getChannel()));
       log.info("Data : {}", new String(message.getBody()));
    }
}
