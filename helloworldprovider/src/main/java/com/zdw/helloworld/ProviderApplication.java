package com.zdw.helloworld;


import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create By zdw on 2019/6/24
 */
@SpringBootApplication
@EnableServiceComb
public class ProviderApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ProviderApplication.class, args);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}