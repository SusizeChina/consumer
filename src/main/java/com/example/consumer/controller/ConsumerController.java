package com.example.consumer.controller;

import com.example.consumer.client.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ProducerClient producerClient;

    @GetMapping("/v1/consumer")
    public String getConsumer() {
        return producerClient.getApplictaionName();
    }
}
