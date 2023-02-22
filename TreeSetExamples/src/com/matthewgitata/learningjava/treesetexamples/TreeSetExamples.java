package com.matthewgitata.learningjava.treesetexamples;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String[] args) {
        Set<Integer> treeSets = new TreeSet<>();
        treeSets.add(1);
        treeSets.add(300);
        treeSets.add(47);
        treeSets.add(6);
        System.out.println(treeSets);
        treeSets.add(6);
        System.out.println(treeSets);

        Set<String> wordSets = new TreeSet<>(Comparator.comparing(String::length));
        wordSets.add("Tiger");
        wordSets.add("Giraffe");
        wordSets.add("Bear");
        System.out.println(wordSets);
        wordSets.add("Wolf");
        System.out.println(wordSets);
        wordSets.remove("Giraffe");
        System.out.println(wordSets);
    }
}
