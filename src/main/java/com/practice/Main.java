package com.practice;

import com.practice.Exceptions.InvalidNumberException;
import com.practice.PractiseQuestions.*;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Patterns.printReversePyramid(5);
        //double absoluteValue = SimpleAlgorithms.absoluteValue(-1000.0);
        //System.out.println(absoluteValue);
        //SimpleAlgorithms.evenOdd(97.0);

        //try {
        //    SimpleAlgorithms.sumBetweenNumber(1, 10);
        //} catch (InvalidNumberException Ine) {
        //    System.err.println("Number1 should be smaller than number 2");
        //
        //SquareOrNot.squareOrNotOfAnInputNumber(12485);
        //FibonacciNumbers.printFibonacciNumbers(100);
        //FibonacciNumbers.fibonacciUsingRecursion(10);
       //ReverseDigits.reverseDigits(145632);
       // PalindromeSequence.detectPalindromeBasic(-121);
    //SimplificationOfFractions.simplifyFractions(22,11);
        //RomanToInteger.romanToInt("XIX");
       //System.out.println(ValidPalindromePhrase.isPalindrome("hello world"));
        int[] nums = {1,2,2,3,3,3,3,3,4,5} ;
        RemoveDuplicates.removeDuplicates(nums);
        System.out.println();

    }
}
