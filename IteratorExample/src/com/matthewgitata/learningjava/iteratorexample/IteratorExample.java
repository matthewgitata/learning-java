package com.matthewgitata.learningjava.iteratorexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "orange", "yellow", "green",
                "blue", "indigo", "violet");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}