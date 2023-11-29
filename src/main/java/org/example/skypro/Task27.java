package org.example.skypro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for. */
public class Task27 {

    public static void main(String[] args) {
        Map<String, Integer> source = new HashMap<>();
        source.put("key1", 1);
        source.put("key2", 2);
        source.put("key3", 3);

        //итерация по ключам
        Iterator<String> iterator = source.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("iterator - " + source.get(key));
        }

        //итерация по вхождениям (по парам ключ-значение)
        Iterator<Map.Entry<String, Integer>> iterator1 = source.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            System.out.println("iterator1 - " + entry);
        }

        for (String s : source.keySet()) {
            System.out.println("for - " + source.get(s));
        }
    }
}
