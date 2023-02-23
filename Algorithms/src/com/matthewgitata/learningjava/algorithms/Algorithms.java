package com.matthewgitata.learningjava.algorithms;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(new int[]{}, 0));
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 8));
    }

    private static boolean linearSearch(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return true;
            }
        }
        return false;
    }
}