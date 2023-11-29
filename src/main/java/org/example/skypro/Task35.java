package org.example.skypro;

import java.util.Arrays;

/* Напишите программу которая на вход получает массив чисел и на выход отдает сумму минимального и максимального значения массива. */
public class Task35 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        Arrays.sort(array);
        System.out.println(array[0] + " " + array[array.length - 1]);
    }
}
