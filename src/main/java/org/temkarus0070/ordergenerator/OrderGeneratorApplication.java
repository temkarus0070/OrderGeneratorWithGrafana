package org.temkarus0070.ordergenerator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "${project.description}", title = "${project.title}"))
public class OrderGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderGeneratorApplication.class, args);
    }

}
