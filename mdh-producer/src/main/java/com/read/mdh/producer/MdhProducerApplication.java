package com.read.mdh.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MdhProducerApplication {

    public static void main(String[] args){
        SpringApplication.run(MdhProducerApplication.class,args);
    }
}
