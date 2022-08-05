package com.practice.PractiseQuestions;

public class FibonacciNumbers {
    /**
     * This algorithm presents the first 100 elements of the Fibonacci numbers.
     * In mathematics, the Fibonacci numbers, commonly denoted Fₙ, form a sequence,4the Fibonacci sequence,
     * in which each number is the sum of the two preceding ones.
     */
    public static void printFibonacciNumbers(int limit) {
        int F1 = 0;
        int F2 = 1;
        int sum = F1 + F2;
        System.out.print(F1 + " " + F2 + " ");

        for (int i = 0; i < limit; i++) {
            System.out.print(sum + " ");
            F1 = F2;
            F2 = sum;
            sum = F1 + F2;
        }
    }

    public int fibonacciUsingRecursion(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);

    }
}
