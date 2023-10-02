package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tickets {
    public static int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static List<String> names = new ArrayList<>(List.of("Owa", "Sasha", "Dasha", "Pavel", "Roman", "Dima", "Aleksey"));
    public static String string = "ommmoor";

    public static void main(String[] args) {
    }

    /* Все четные числа увеличиваем на единицу. Возвращаем кусок списка с 3-го по 7-й элемент. */
    public static int[] changeArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i]++;
            }
        }
        return Arrays.copyOfRange(ints, 2, 7);
    }

    /*Дан List ‹String› names. Удалите первую букву из каждого имени и верните отсортированный список.*/
    public static List<String> task1(List<String> str) {
        return str.stream()
                .map(s -> s.substring(1))
                .sorted()
                .toList();
    }

    /* Тоже самое, но для массива строк */
    public static Object[] task1(String[] str) {
        return Arrays.stream(str)
                .map(s -> s.substring(1))
                .sorted()
                .toArray();
    }

    /* Напишите программу, которая переворачивает массив. */
    public static int[] task2(int[] ints) {
        int[] newArr = new int[ints.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[newArr.length - 1 - i] = ints[i];
        }
        return newArr;
    }

    /* вариант быстрее */
    public static int[] task2_1(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
        }
        return ints;
    }

    /* через коллекции */
    public static Integer[] task2_2(Integer[] integers) {
        Collections.reverse(Arrays.asList(integers));
        return integers;
    }
    /* является ли строка палиндромом */
    public static boolean task3(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
