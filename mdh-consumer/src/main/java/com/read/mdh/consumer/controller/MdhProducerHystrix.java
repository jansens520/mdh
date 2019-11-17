package com.read.mdh.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class MdhProducerHystrix implements MdhProducerService{

    @RequestMapping("/hello")
    public String hello() {
        return "sorry,hello service call failed";
    }
}
