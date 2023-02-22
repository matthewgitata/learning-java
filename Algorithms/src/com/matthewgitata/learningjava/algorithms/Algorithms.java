package com.matthewgitata.learningjava.algorithms;

public class Algorithms {
    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(isAtEvenIndex(s, 'L'));
        System.out.println(isAtEvenIndex(s, 'T'));
        System.out.println(isAtEvenIndex(s, 'o'));
        System.out.println(isAtEvenIndex("", 'H'));
        System.out.println(isAtEvenIndex(null, 'H'));
    }

    public static boolean isAtEvenIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i = i + 2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }
}