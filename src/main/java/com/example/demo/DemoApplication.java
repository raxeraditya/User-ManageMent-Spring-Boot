package com.example.demo; // this is base pckage
// If a class is placed outside the base package,
//  Spring won't detect it unless you
//  explicitly specify it using @ComponentScan
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
