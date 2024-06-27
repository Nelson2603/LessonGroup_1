package org.example.task1_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        // Добавление элементов
        linkedHashMap.put("ключ1", 1);
        linkedHashMap.put("ключ2", 2);
        linkedHashMap.put("ключ3", 3);
        linkedHashMap.put("ключ4", 4);
       for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }


    }
}
