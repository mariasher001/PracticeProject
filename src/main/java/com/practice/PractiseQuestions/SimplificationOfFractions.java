package com.practice.PractiseQuestions;

public class SimplificationOfFractions {
    /**
     * This algorithm simplifies a fraction specified by a numerator and a dominator.
     */
    public static void simplifyFractions(int numerator, int denominator) {
        int limit = 0;

        if (numerator < denominator)
            limit = numerator;
        else
            limit = denominator;

        for (int divisor = 2; divisor <= limit; divisor++) {
            if (numerator % divisor == 0 && denominator % divisor == 0) {
                numerator = numerator / divisor;
                denominator = denominator / divisor;
            }
        }
        System.out.println(""+numerator+"/"+denominator);
    }
}
