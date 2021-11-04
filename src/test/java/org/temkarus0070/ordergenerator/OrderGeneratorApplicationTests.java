package org.temkarus0070.ordergenerator;

import org.junit.jupiter.api.Test;
import org.mockito.internal.junit.JUnitRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.temkarus0070.ordergenerator.controllers.OrderGeneratorController;
import org.temkarus0070.ordergenerator.models.Order;
import org.temkarus0070.ordergenerator.services.OrderGenerator;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OrderGeneratorApplicationTests {
    OrderGeneratorController orderGeneratorController;

    @Autowired
    public void setOrderGeneratorController(OrderGeneratorController orderGeneratorController) {
        this.orderGeneratorController = orderGeneratorController;
    }

    @Test
    void contextLoads() {
        Order order= orderGeneratorController.generateOrder();
       assertThat(orderGeneratorController).isNotNull();
       assertThat(order).hasNoNullFieldsOrProperties();
    }

}
