package com.learning.loggingaspect;

import com.learning.loggingaspect.service.inter.StudentServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AspectforloggingApplication {

    @Autowired
    StudentServiceInter studentService;

    public static void main(String[] args) {
        SpringApplication.run(AspectforloggingApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        CommandLineRunner clr = args -> studentService.getStudent();

        return clr;
    }
}
