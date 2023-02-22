package main.java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionExercise {
    public void addSixToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    public void addZerToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addFirst(i);
    }

    public void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();
    }

    public void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.remove(0);
    }

    public void addItemToTreeSet(Set<String> set, String item) {
        set.add(item);
    }
}