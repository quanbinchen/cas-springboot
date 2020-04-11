package com.yks.springbootcas.cas;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient   //启动cas
public class Test3App {

    public static void main(String[] args) {
        SpringApplication.run(Test3App.class,args);
    }


}

