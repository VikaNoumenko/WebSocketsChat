package ru.itis.config;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(value = "ru.itis")
@PropertySource("hibernate")
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
