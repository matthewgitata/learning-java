package com.matthewgitata.learningjava.algorithms;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(isUppercase("hello"));
        System.out.println(isUppercase("HELLO"));

        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("HELLO"));
    }

    public static boolean isUppercase(String s) {
//        return s.chars().noneMatch(Character::isLowerCase);
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
//        return s.chars().noneMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);
    }
}