package org.example.task_3_mockito_JUnit.repository;

import org.example.task_3_mockito_JUnit.db.DataBase;
import org.example.task_3_mockito_JUnit.model.User;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {


    @Override
    public void addUser(User user) {
        DataBase.users.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return DataBase.users;
    }

    @Override
    //вернуть объект с id который передали в метод
    public Optional<User> findUserById(int id) {
        for (User user : DataBase.users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();


    }

    @Override
    public double getTotalSalary() {
//       return DataBase.users.stream()
//                .map(User::getSalary)
//                .mapToDouble(Double::doubleValue)
//                .sum();

        double sum = 0;
        for (User user : DataBase.users) {
            sum += getTotalSalary();
        }
        return sum;
    }


    @Override
    public void deleteUserById(int id) {
        for (User user : DataBase.users) {
            if (user.getId() == id) {
                DataBase.users.remove(user);
            }
        }
    }


    //обновить юзера
    //найти юзера с такми же id и обновить все его свойства на те что у объекта который мы приняли в метод
    @Override
    public void updateUser(User updatedUser) {
        for (User user : DataBase.users) {
            if (updatedUser.getId() == user.getId()) {
                user.setName(updatedUser.getName());
                user.setSalary(updatedUser.getSalary());
                user.setDepartment(updatedUser.getDepartment());
                break;
            }
        }
    }


}
