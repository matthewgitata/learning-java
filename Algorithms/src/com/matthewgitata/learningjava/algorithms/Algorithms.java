package com.matthewgitata.learningjava.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Algorithms {
    public static void main(String[] args) {
        printBinary(2);
        printBinary(6);
    }

    public static void printBinary(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        System.out.println();
    }
}