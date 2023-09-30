package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tickets {
    public static int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static List<String> names = new ArrayList<>(List.of("Owa", "Sasha", "Dasha", "Pavel", "Roman", "Dima", "Aleksey"));

    public static void main(String[] args) {
        System.out.println(task1(names));

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

    /*Тоже самое, но для массива строк*/
    public static Object[] task1(String[] str) {
        return Arrays.stream(str)
                .map(s -> s.substring(1))
                .sorted()
                .toArray();
    }
}
