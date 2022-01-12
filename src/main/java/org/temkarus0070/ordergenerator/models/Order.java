package org.temkarus0070.ordergenerator.models;

import lombok.Data;

import java.util.Collection;

@Data
public class Order {
    private String clientFIO;
    private long orderNum;
    private Collection<Good> goods;

}
