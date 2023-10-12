package org.example.skypro;

import java.util.*;
import java.util.stream.Collectors;

public class Tickets {
    public static int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static String[] strings = {"Owa", "Sasha", "Sasha", "Pavel", "Roman", "Dima", "Aleksey"};
    public static List<String> names = new ArrayList<>(List.of("Owa", "Sasha", "Sasha", "Pavel", "Roman", "Dima", "Aleksey"));
    public static String string = "ommmoor";
    public static String[][] books = {{"Мастер и Маргарита", "М. А. Булгаков"}, {"Облачный Атлас", "Дэвид Митчелл"}, {"Маленькие женщины", "Луиза Мэй Скотт"}};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(task12(books)));
    }

    /* Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И.О. Автора */
    public static String[] task12(String[][] str) {
        StringBuilder result = new StringBuilder();
        for (String[] part : str) {
            String book = part[0];
            String author = part[1];
            result.append("\"").append(book).append("\" ").append(author).append(", ");
        }
        String output = result.toString();
        output = output.substring(0, output.length() - 2);
        // вернет строку книга-автор через запятую
//        return output;

        // вернет массив книга-автор
        String[] bookAuthorArray = output.split(", ");
        return bookAuthorArray;
    }

    /* Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве. */
    public static String task11(String[] str) {
        Set<String> set = Arrays.stream(str).collect(Collectors.toSet());
        List<String> result = new ArrayList<>(set);
        return result.stream()
                .sorted()
                .collect(Collectors.joining(" "));
    }

    /* Все четные числа увеличиваем на единицу. Возвращаем кусок списка с 3-го по 7-й элемент. */
    public static int[] task15(int[] ints) {
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
