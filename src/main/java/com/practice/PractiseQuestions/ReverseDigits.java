package com.practice.PractiseQuestions;

public class ReverseDigits {
    /**
     *  This algorithm reverses the order of digits of a positive integer value.
     * @param number
     */
    public static void reverseDigits(int number) {
        int reserve = number;
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number = number/10;
        }
        System.out.print(reverseNumber);
    }
}
