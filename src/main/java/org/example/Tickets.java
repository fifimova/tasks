package org.example;

import java.util.Arrays;

public class Tickets {
    public static int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static String[] strings = {"Sasha", "Dasha", "Pavel", "Roman", "Dima", "Aleksey"};

    public static void main(String[] args) {

    }

    /* Все четные числа увеличиваем на единицу.
     * Возвращаем кусок списка с 3-го по 7-й элемент. */
    public static int[] changeArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i]++;
            }
        }
        return Arrays.copyOfRange(ints, 2, 7);
    }

    /*Дан List ‹String› names. Удалите первую букву из каждого имени и верните отсортированный список.*/
    public static String[] task1(String[] str) {
        Arrays.stream(str).map()
    }
}
