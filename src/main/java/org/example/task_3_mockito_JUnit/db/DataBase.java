package org.example.task_3_mockito_JUnit.db;

import org.example.task_3_mockito_JUnit.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    // Статический список пользователей
    public static List<User> users = new ArrayList<>();

    // Статический блок инициализации для заполнения списка пользователей
    static {
        users.add(new User(1, "John Doe", 5000.0, "IT"));
        users.add(new User(2, "Jane Smith", 6000.0, "HR"));
        users.add(new User(3, "Michael Johnson", 7000.0, "Finance"));
        users.add(new User(4, "Emily Davis", 8000.0, "Marketing"));
        users.add(new User(5, "Chris Brown", 5500.0, "IT"));
        users.add(new User(6, "Patricia Taylor", 6200.0, "HR"));
        users.add(new User(7, "Robert Miller", 7300.0, "Finance"));
        users.add(new User(8, "Linda Anderson", 8100.0, "Marketing"));
        users.add(new User(9, "James Wilson", 5200.0, "IT"));
        users.add(new User(10, "Barbara Moore", 6100.0, "HR"));
        users.add(new User(11, "David Clark", 7200.0, "Finance"));
        users.add(new User(12, "Susan Hall", 8000.0, "Marketing"));
    }
}
