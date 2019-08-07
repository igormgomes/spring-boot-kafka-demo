package com.spring.boot.kakfa.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
class KakfaConsumer implements Consumer {

    private static final Logger logger = LoggerFactory.getLogger(KakfaConsumer.class);

    @KafkaListener(topics = "topic-demo", groupId = "group_id")
    public void consume(String message){
        logger.info(String.format("Message -> %s", message));
    }
}
