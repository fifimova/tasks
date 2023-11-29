package org.example.skypro;

import java.util.Arrays;

/* чтобы найти второе по величине число в массиве. */
public class Task31 {
    public static void main(String[] args) {
        int[] ints = {2, 100, 110, 35, 11, 67, 4, 2, 0, 0};
        Arrays.sort(ints);
        System.out.println(ints[ints.length - 2]);
    }
}
