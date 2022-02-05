package org.temkarus0070.ordergenerator.services;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.temkarus0070.ordergenerator.models.Good;
import org.temkarus0070.ordergenerator.models.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Service
public class OrderGenerator {
    Logger logger = LoggerFactory.getLogger(OrderGenerator.class);

    public Order generateOrder() {
        logger.info("begin of order generation");
        Random random = new Random(new Date().getTime());
        Faker faker = new Faker();
        Order order = new Order();
        order.setClientFIO(faker.name().nameWithMiddle());
        order.setOrderNum(faker.number().numberBetween(1,1000000000));
        int goodsCount = faker.number().numberBetween(1, 100);
        logger.info("begin to add goods to list");
        List<Good> goods = new ArrayList<>();
        for (int i = 0; i < goodsCount; i++) {
            Good good = new Good();
            good.setCount(faker.number().numberBetween(1, 100));
            int choice = random.nextInt(4);
            switch (choice) {
                case 0:
                    good.setName(faker.food().dish());
                    break;
                case 1:
                    good.setName(faker.food().fruit());
                    break;
                case 2:
                    good.setName(faker.food().sushi());
                    break;
                case 3:
                    good.setName(faker.food().spice());
                    break;
                default:
                    good.setName(faker.food().ingredient());
                    break;
            }
            good.setPrice(faker.number().randomDouble(3, 0, 5000));
            good.setSum(good.getPrice() * good.getCount());
            goods.add(good);
        }
        logger.info("add goods to order");
        order.setGoods(goods);
        logger.info("return order");
        return order;
    }
}
