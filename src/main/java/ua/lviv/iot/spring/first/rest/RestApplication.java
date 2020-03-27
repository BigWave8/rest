package ua.lviv.iot.spring.first.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "ua.lviv.first.dataaccess", "ua.lviv.iot.first.business", "ua.lviv.iot.spring.first.rest.controller" })
@EnableJpaRepositories("ua.lviv.first.dataaccess")
@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}
