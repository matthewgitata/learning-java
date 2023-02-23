package com.matthewgitata.learningjava.algorithms;

import java.util.LinkedList;

public class Algorithms {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Sally");
        stringLinkedList.add("Becky");
        stringLinkedList.add("Nicky");
        stringLinkedList.add("Jack");
        stringLinkedList.add("Rachel");

        System.out.println(stringLinkedList.contains("Becky"));
        System.out.println(stringLinkedList.size());

        stringLinkedList.removeFirst();

        for (String s : stringLinkedList) {
            System.out.print(s + "->");
        }

        System.out.println();

        stringLinkedList.forEach(x -> System.out.print(x + "->"));
    }
}