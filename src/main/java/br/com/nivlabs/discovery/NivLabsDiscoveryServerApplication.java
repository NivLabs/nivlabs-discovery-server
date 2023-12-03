package br.com.nivlabs.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NivLabsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NivLabsDiscoveryServerApplication.class, args);
	}

}
