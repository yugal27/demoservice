package com.bw.integration.ThirdPartyX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.bw.integration.ThirdPartyX.controller"})
@SpringBootApplication
public class ThirdPartyXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdPartyXApplication.class, args);
	}

}
