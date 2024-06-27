package org.example.task1_map;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
@Getter

public class Order {
    private double sumOfOrder;
    private List<String> products;

    public Order(double sumOfOrder, List<String> products) {
        this.sumOfOrder = sumOfOrder;
        this.products = products;
    }


}
