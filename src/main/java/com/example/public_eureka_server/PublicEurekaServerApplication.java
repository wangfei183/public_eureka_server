package com.example.public_eureka_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PublicEurekaServerApplication {
    private static Logger logger= LoggerFactory.getLogger(PublicEurekaServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PublicEurekaServerApplication.class, args);
        logger.info("Eureka公共服务启动完成----------------------------");
    }

}
