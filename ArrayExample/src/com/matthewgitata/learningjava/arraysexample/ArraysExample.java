package com.matthewgitata.learningjava.arraysexample;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Mon", "Tue", "Wed"};
        System.out.println(Arrays.toString(weekdays));

        for (String day : weekdays) {
            System.out.println("Weekday: " + day);
        }

        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));
    }
}
