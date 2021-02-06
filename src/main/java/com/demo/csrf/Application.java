package com.demo.csrf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by guptaavi on 1/31/2021
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
