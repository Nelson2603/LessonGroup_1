package org.example.task1_map;

import java.util.*;
import java.util.stream.Collectors;

public class MainOrder {
    public static void main(String[] args) {
//        Order order = new Order(1200);
//        order.getProducts().addAll(Arrays.asList("Молоко","Хлеб"));

        Map<String, Order> cityOrders = new HashMap<>();//создали Map где ключ название городов значение Order
        cityOrders.put("Москва", new Order(400, Arrays.asList("молоко", "сыр", "творог")));
        cityOrders.put("Санкт-Петербург", new Order(250, Arrays.asList("молоко", "Бананы")));
        cityOrders.put("Иваново", new Order(1200, Arrays.asList("Хлеб", "рыба", "лук")));
//        cityOrders.put("Иваново", new Order(800, Arrays.asList("Хлеб", "рыба", "лук")));
        cityOrders.put("Екатеринбург", new Order(950.50, Arrays.asList("Картошка", "пельмени")));

        Set<Map.Entry<String, Order>> entries = cityOrders.entrySet();
        Set<Map.Entry<String, Order>> ivanovoOrders = entries.stream()
                .filter(entry -> entry.getKey().equals("Иваново"))
                .collect(Collectors.toSet());
        ivanovoOrders.forEach(order -> {
            System.out.println("Продукты заказанные в Иваново: " + order.getValue().getProducts());
            System.out.println("Стоимость заказа: " + order.getValue().getSumOfOrder());
        });
    }
}
