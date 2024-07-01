package org.example.task_3_mockito_JUnit.repository;

import org.example.task_3_mockito_JUnit.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void addUser(User user);

    // Метод для получения всех пользователей
    List<User> getAllUsers();

    // Метод для поиска пользователя по ID
    Optional<User> findUserById(int id);

    // Метод для получения общей суммы зарплат всех пользователей
    double getTotalSalary();

    // Метод для удаления пользователя по ID
    void deleteUserById(int id);



    // Метод для обновления информации о пользователе
    void updateUser(User updatedUser);
}
