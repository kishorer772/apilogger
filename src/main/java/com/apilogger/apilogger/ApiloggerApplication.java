package com.apilogger.apilogger;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



// @EnableJpaRepositories
@EnableMongoRepositories
@EntityScan("com.apilogger.apilogger.dao")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class ApiloggerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiloggerApplication.class, args);
	}
	
}
