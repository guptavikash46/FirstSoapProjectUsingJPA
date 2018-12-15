package com.vikas.SoapJPA.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.vikas"})
@EnableAutoConfiguration
@EntityScan({"com.vikas"})
@EnableJpaRepositories({"com.vikas"})
public class projectSoapJPAapplication {


    public static void main(String[] args) {
        SpringApplication.run(projectSoapJPAapplication.class, args);

    }
}
