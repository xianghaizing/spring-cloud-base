package com.lyf.configbusserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigBusServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigBusServerApplication.class, args);
  }

}

