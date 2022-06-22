package com.kafkaconsumer.listener;

import com.product.model.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "product_topic", groupId = "group_id")
//    public void consume(String message) {
//        System.out.println("Consumed message: " + message);
//    }


    @KafkaListener(topics = "product_topic", groupId = "group_json",
            containerFactory = "productKafkaListenerFactory")
    public void consumeJson(Product product) {
        System.out.println("Consumed JSON Message: " + product);
    }
}