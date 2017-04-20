package com.tf;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class QuickQuoteApplication {

	public static void main(String[] args) throws SQLException {
		
		SpringApplication.run(QuickQuoteApplication.class, args);
	}
}
