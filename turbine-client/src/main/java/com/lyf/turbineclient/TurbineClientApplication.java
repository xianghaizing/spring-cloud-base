package com.lyf.turbineclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class TurbineClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineClientApplication.class, args);
	}

}

