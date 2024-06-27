package org.example.task1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Lesson1 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Иванов Иван Иванович", 5);//добавление в Map происходит через метод put
        students.put("Петров Петр Петрович", 3);
        students.put("Сидоров Сидор Сидорович", 4);
        students.put("Кузнецов Николай Николаевич", 2);
        students.put("Смирнов Андрей Андреевич", 5);


        System.out.println("Хорошо учатся : ");
        Set<Map.Entry<String, Integer>> entries = students.entrySet();//1 получить сет из меп
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == 5 || entry.getValue() == 4) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        System.out.println("+++++++ через стримы ++++++++++++++");
        Set<Map.Entry<String, Integer>> betterMan = students.entrySet().stream()
                .filter(entry -> entry.getValue() == 5 || entry.getValue() == 4)
                .collect(Collectors.toSet());
        betterMan.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
