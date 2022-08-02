package com.practice.PractiseQuestions;

import com.practice.Exceptions.InvalidNumberException;

public class SimpleAlgorithms {

    public static double absoluteValue(double inputNumber){
        if(inputNumber < 0){
            inputNumber *= -1;
        }
        //System.out.println("The absoluteValue is: " + inputNumber);
        return inputNumber;
    }

    //This algorithm tells whether an integer (given as input) is an even or odd number
    public static void evenOdd(double input){
        if(input % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    //This algorithm asks two numbers from user and tells the relation of them (greater, smaller,
    //equal).
    public static void relationBetweenNumbers(int num1,int num2){
        if(num1 > num2)
            System.out.println(num1+ " is greater than "+ num2);
        else if (num1<num2)
            System.out.println(num1+ "is less than "+ num2);
        else
            System.out.println(num1 + "is Equal to "+  num2);
    }
    //This algorithm calculates the sum of integers between two different integer values given by the
    //user (including the limits).

    public static void sumBetweenNumber(int num1,int num2) throws InvalidNumberException {
        int sum=0;
        if(num1>num2){
            throw new InvalidNumberException("Number1 cannot be less than Number2",new InvalidNumberException());
        }
        for (int i = num1; i<=num2;i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);

    }


}
