package org.example.skypro;

import java.util.HashMap;
import java.util.Map;

/* Напишите программу для подсчета количества конкретных слов в строке, используя HashMap. */
public class Task26 {
    public static void main(String[] args) {
        String source = "a a a b b b c c t b b";

        Map<String, Integer> count = new HashMap<>();
        for (String s : source.split(" ")) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }
        System.out.println(count);
    }
}
