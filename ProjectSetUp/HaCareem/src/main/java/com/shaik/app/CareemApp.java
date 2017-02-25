package com.shaik.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jabbars on 2/21/2017.
 */


@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.shaik","com.shaik.rest"})
@SpringBootApplication
public class CareemApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CareemApp.class, args);
    }
}
