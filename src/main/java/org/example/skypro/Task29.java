package org.example.skypro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for. */
public class Task29 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        for (Integer i : list) {

        }

    }
}
