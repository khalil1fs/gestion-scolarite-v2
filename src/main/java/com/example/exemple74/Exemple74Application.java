package com.example.exemple74;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Exemple74Application {
    public static ConfigurableApplicationContext ctx;
    public static void main(String[] args) {
      ctx =  SpringApplication.run(Exemple74Application.class, args);
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }



}
