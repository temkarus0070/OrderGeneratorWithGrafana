package org.temkarus0070.ordergenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.temkarus0070.ordergenerator.models.Order;
import org.temkarus0070.ordergenerator.services.OrderGenerator;

@SpringBootTest
public class OrderGeneratorTest {

    private OrderGenerator orderGenerator;

    @Autowired
    public void setOrderGenerator(OrderGenerator orderGenerator) {
        this.orderGenerator = orderGenerator;
    }

    @Test
    public void test(){
        final Order order = orderGenerator.generateOrder();
        Assertions.assertNotNull(order);
    }
}
