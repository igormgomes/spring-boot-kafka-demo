package com.spring.boot.kakfa.demo.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
class KakfaProducer implements Producer {

    private static final Logger logger = LoggerFactory.getLogger(KakfaProducer.class);

    @Value("${topic.name}")
    private String topicName;

    private KafkaTemplate<String, String> kafkaTemplate;

    public KakfaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void send(String message) {
        logger.info(message);

        this.kafkaTemplate.send(topicName, message);
    }
}
