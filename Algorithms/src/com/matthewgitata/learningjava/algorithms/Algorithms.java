package com.matthewgitata.learningjava.algorithms;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(new int[]{}, 0));
        System.out.println(linearSearch(arr, 5));
        System.out.println(linearSearch(arr, 8));
    }

    private static OptionalInt linearSearch(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }
}