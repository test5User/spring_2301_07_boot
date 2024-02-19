package by.itclass.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyFirstSpringBootApplication {
    @GetMapping
    String home() {
        return "Hello World!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringBootApplication.class, args);
    }
}
