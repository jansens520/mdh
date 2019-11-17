package com.read.mdh.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "mdh-producer",fallback = MdhProducerHystrix.class)
public interface MdhProducerService {

    @RequestMapping("/hello")
    public String hello();
}
