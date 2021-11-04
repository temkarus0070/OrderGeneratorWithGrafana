package org.temkarus0070.ordergenerator.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.temkarus0070.ordergenerator.models.Order;
import org.temkarus0070.ordergenerator.services.OrderGenerator;

@RestController
public class OrderGeneratorController {
    private OrderGenerator orderGenerator;

    @Autowired
    public void setOrderGenerator(OrderGenerator orderGenerator) {
        this.orderGenerator = orderGenerator;
    }

    @RequestMapping(path = "/generateOrder")
    public Order generateOrder(){
       return orderGenerator.generateOrder();
    }

}
