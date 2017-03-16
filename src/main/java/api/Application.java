/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


/**
 *
 * @author OPEYEMI
 */



@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfiguration.class)
@EnableAutoConfiguration
@ComponentScan({ "api.web", "api.rest", "api.service" })
@EnableMongoRepositories
@EnableJpaRepositories
public class Application {
    
    public static void main(String[] args) {
		      SpringApplication.run(Application.class, args);
	}
    
}
