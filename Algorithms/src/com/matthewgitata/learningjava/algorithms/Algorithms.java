package com.matthewgitata.learningjava.algorithms;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(new int[]{}, 0));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 8));
    }

    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == item) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
}