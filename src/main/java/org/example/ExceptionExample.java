package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public static String string = "ommmoor";

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        example.task10();
    }

    /* Напишите пример обработки нескольких исключений в одном блоке catch */
    public void task10() {
        try {
            int[] array = new int[0];
            array[0] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }


    /* Напишите пример перехвата и обработки исключения с использованием собственных исключений. */
    public void task9() {
        try {
            throw new RandomException("Исключение поймано");
        } catch (RandomException e) {
            System.out.println(e.getMessage());
        }
    }

    /* Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу. */
    public void task8(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String s = reader.readLine();
    }

    public void task8_1() {
        try {
            task8("");
        } catch (FileNotFoundException e) {
            System.out.println("Файла не существует");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при вводе/выводе данных");
            e.printStackTrace();
        }
    }

    /* перехват и обработка исключения */
    public static void task7(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Файла не существует");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при вводе/выводе данных");
            e.printStackTrace();
        }
    }
}

