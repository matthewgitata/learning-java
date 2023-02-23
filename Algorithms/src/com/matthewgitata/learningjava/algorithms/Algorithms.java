package com.matthewgitata.learningjava.algorithms;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Algorithms {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(3);
        queue.add(19);
        queue.add(20);

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}