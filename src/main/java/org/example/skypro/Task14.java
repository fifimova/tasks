package org.example.skypro;

/*
  Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
    1. На входе коллекция пользователей
    2. Необходимо удалить все дубли (одинаковое имя и возраст)
    3. Отсортировать по возрасту и имени
    4. Вернуть самого старого пользователя
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task14 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Pasha", 20));
        users.add(new User("Pasha", 200));
        users.add(new User("Pasha", 20));
        users.add(new User("Sasha", 20));
        users.add(new User("Dasha", 10));
        users.add(new User("Masha", 10));
        users.add(new User("Sasha", 20));
        users.add(new User("Lasha", 20));
        users.add(new User("Vasha", 26));

        System.out.println(task14(users));
    }

    static User task14(List<User> users) {
        List<User> processUsers = users.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println(processUsers);
        return processUsers.get(processUsers.size() - 1);
    }
}

class User implements Comparable<User> {
    String name;
    Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User o) {
        if (age.compareTo(o.age) != 0) {
            return age.compareTo(o.age);
        }
        return this.name.compareTo(o.name);
    }
}