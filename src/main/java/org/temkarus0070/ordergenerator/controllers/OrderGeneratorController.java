package org.temkarus0070.ordergenerator.controllers;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.temkarus0070.ordergenerator.models.Order;
import org.temkarus0070.ordergenerator.services.OrderGenerator;

@RestController
@RequestMapping(path = "/order")
public class OrderGeneratorController {
    private OrderGenerator orderGenerator;

    @Autowired
    public OrderGeneratorController(OrderGenerator orderGenerator) {
        this.orderGenerator = orderGenerator;
    }


    @Operation(description = "get order with fake data")
    @GetMapping(path = "/generate")
    public Order generateOrder() {
        return orderGenerator.generateOrder();
    }

}
