package org.example.skypro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Создать метод, который преобразует массив объектов User (c полями name, age, phone) в карту
 * Номер телефона -> Имя пользователя
 */
public class Task17 {

    public static void main(String[] args) {
        User2[] user2s = {
                new User2("Papapa", 20, "8912344533"),
                new User2("Sasasa", 20, "8912344544"),
                new User2("Lalall", 20, "8912344555")
        };

//        System.out.println(toMap(user2s).toString());
        System.out.println(toMap2(user2s).toString());
    }


    public static HashMap<String, String> toMap(User2[] user2s) {
        List<String> phones = Arrays.stream(user2s).map(user2 -> user2.phone).toList();
        List<String> names = Arrays.stream(user2s).map(user2 -> user2.name).toList();
        HashMap<String, String> pair = new HashMap<>();
        for (int i = 0; i < phones.size(); i++) {
            String phone = phones.get(i);
            String name = names.get(i);
            pair.put(phone, name);
        }
        return pair;
    }

    public static HashMap<String, String> toMap2(User2[] user2s) {
        HashMap<String, String> pair = new HashMap<>();
        for (User2 user : user2s) {
            pair.put(user.phone, user.name);
        }
        return pair;
    }

}

class User2 {
    String name;
    int age;
    String phone;

    public User2(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
