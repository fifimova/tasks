package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static String[] strings = {"Java", "Java", "Spring", "Java", "Murzilki", "Idea", "Java"};

    public static void main(String[] args) {
        System.out.println(task(strings));
    }

    public static String task(String[] strings) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(strings));
        return String.join(" ", set);
    }
}