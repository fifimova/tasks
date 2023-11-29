package org.example.skypro;

/* проверки является ли введенное число - числом Армстронга. */
public class Task32 {

    public static void main(String[] args) {
        int num = 153;
        int tempNum = num;
        int sum = 0;
        int digit = 0;
        final int POW = 3;

        while (tempNum > 0) {
            digit = tempNum % 10;
            sum += Math.pow(digit, POW);
            tempNum /= 10;
        }

        if(sum == num) {
            System.out.println(num + " is the Armstrong number");
        } else {
            System.out.println(num + " isn't the Armstrong number");
        }
    }
}
