package com.dockube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockubeApplication {

	public static void main(String[] args) {
		System.setProperty("INS", "System-" + System.currentTimeMillis());
		SpringApplication.run(DockubeApplication.class, args);
	}
}
