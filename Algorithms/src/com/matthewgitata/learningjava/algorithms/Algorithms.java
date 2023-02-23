package com.matthewgitata.learningjava.algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        rotateInPlace(arr);
        Arrays.stream(arr)
                .forEach(System.out::print);
    }

    private static void rotateInPlace(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int i = 1; i < arr.length - 2; i++) {
            int shiftedIndex = i + 1;
            int temp2 = arr[i];
            arr[i] = arr[shiftedIndex];
            arr[shiftedIndex] = temp2;
        }
    }
}