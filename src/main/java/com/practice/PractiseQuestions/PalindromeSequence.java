package com.practice.PractiseQuestions;

public class PalindromeSequence {
    public static void detectPalindromeBasic(int number){

        int reverseNumber = 0;
        int inputNumber = number;

        while(number>0){
            reverseNumber = (reverseNumber *10 )+ (number%10);
            number = number/10;
        }
        if(reverseNumber == inputNumber){
            System.out.println("The number is a palindrome");
        }
        else
            System.out.println("The number is not a palindrome");

    }

}
