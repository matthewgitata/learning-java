package com.matthewgitata.learningjava.algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        rotateArrayLeft(arr);
        Arrays.stream(arr)
                .forEach(System.out::print);
        System.out.println();
        rotateArrayRight(arr);
        Arrays.stream(arr)
                .forEach(System.out::print);
        System.out.println();
    }

    private static void rotateArrayLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int shiftedIndex = i + 1;
            arr[i] = arr[shiftedIndex];
        }
        arr[arr.length - 1] = temp;

    }

    private static void rotateArrayRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length -1; i > 0; i--) {
            int shiftedIndex = i - 1;
            arr[i] = arr[shiftedIndex];
        }
        arr[0] = temp;

    }
}