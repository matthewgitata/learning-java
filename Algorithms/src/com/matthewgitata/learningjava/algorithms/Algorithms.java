package com.matthewgitata.learningjava.algorithms;

import java.util.Locale;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(normalizeString("     Hello There, BUDDY "));
    }

    public static String normalizeString(String s) {
        return s.toLowerCase(Locale.ROOT).
                trim()
                .replace(",", "");
    }
}