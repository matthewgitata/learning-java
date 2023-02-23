package com.matthewgitata.learningjava.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr1 = {-9, 3, 2, -8, 12, -16};
        int[] arr2 = {0, -3, -8, -35, 40, 20, 7};
        Arrays.stream(findEvenNums(arr1, arr2))
                .forEach(System.out::println);
    }

    private static int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i : arr1) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        for (int i : arr2) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        int[] result = new int[evens.size()];
        for (int i = 0; i < evens.size(); i++) {
            result[i] = evens.get(i);
        }
        return result;
    }
}