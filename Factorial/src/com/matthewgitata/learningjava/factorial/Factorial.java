package com.matthewgitata.learningjava.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(10));
        System.out.println(recursiveFactorial(10));
    }

    public static int iterativeFactorial(int n) {
        int result =1 ;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }

    public static int recursiveFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return n * recursiveFactorial(n - 1);
    }
}