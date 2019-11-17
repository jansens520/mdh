package com.read.mdh.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MdhZuulApplication {

    public static void main(String[] args){
        SpringApplication.run(MdhZuulApplication.class,args);
    }
}
