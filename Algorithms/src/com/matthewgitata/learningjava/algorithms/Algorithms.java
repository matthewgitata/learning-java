package com.matthewgitata.learningjava.algorithms;

import java.util.ArrayList;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Hello World"));
        System.out.println(reverseEachWord("racer racecar madam"));
    }

    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            result.append(reverse(arr[i]));
            if (i != arr.length - 1)
                result.append(" ");
        }
        return result.toString();
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}