package org.temkarus0070.ordergenerator.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;
import org.temkarus0070.ordergenerator.models.Good;
import org.temkarus0070.ordergenerator.models.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Component
public class OrderGenerator {

    public Order generateOrder() {
        Random random = new Random(new Date().getTime());
        Faker faker = new Faker();
        Order order = new Order();
        order.setClientFIO(faker.name().nameWithMiddle());
        order.setOrderNum(faker.number().randomNumber());
        int goodsCount = faker.number().numberBetween(1, 100);
        List<Good> goods=new ArrayList<>();
        for (int i = 0; i < goodsCount; i++) {
            Good good = new Good();
            good.setCount(faker.number().numberBetween(1, 100));
            good.setId(faker.number().numberBetween(1, 1000000000));
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
        order.setGoods(goods);
        return order;

    }
}
