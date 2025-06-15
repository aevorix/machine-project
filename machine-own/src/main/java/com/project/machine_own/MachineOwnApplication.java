package com.project.machine_own;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MachineOwnApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineOwnApplication.class, args);
	}

}
