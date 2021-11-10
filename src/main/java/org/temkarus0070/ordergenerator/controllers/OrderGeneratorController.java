package org.temkarus0070.ordergenerator.controllers;


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
public class OrderGeneratorController {
    private OrderGenerator orderGenerator;

    @Value("${orderSenderServer}")
    private String orderSenderServer;

    @Autowired
    public void setOrderGenerator(OrderGenerator orderGenerator) {
        this.orderGenerator = orderGenerator;
    }

    @GetMapping(path = "/generateOrder")
    public Order generateOrder(){
       Order order=orderGenerator.generateOrder();
        return order;
    }

}
