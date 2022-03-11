package com.example.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "producer")
public interface ProducerClient {

    @GetMapping("/v1/producer")
    String getApplictaionName();
}
