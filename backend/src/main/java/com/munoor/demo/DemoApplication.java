/**
 * 2020.05.16  - Created
 */
package com.munoor.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    Environment environment;

    @GetMapping("/test")
    String testConnection() {
        return "Hello from you server @ port: " + environment.getProperty("local.server.port");
    }

}
