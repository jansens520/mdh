package com.read.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages={"com.read.backup"})
@EnableSwagger2
public class MdhBackupApplication {
    public static void main(String[] args) {
        SpringApplication.run(MdhBackupApplication.class, args);
    }
}
