package com.read.mdh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.read.mdh"})
@EnableSwagger2
public class MdhApplication {

    public static  void main(String[] args){
        SpringApplication.run(MdhApplication.class,args);
    }
}
