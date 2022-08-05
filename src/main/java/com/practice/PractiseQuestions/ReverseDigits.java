package com.practice.PractiseQuestions;

public class ReverseDigits {

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
