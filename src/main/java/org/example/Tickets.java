package org.example;

import java.util.Arrays;

public class Tickets {

    /* Получаем на входе массив чисел.
     * Все четные числа увеличиваем на единицу.
     * Возвращаем кусок списка с 3-го по 7-й элемент. */

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(changeArray(ints)));

    }

    public static int[] changeArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i]++;
            }
        }
        return Arrays.copyOfRange(ints, 2, 7);
    }
}
