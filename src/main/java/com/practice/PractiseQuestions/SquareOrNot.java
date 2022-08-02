package com.practice.PractiseQuestions;

import javax.swing.text.html.parser.Parser;

/**
 * This algorithm tells whether the input value is a square of an integer or not.
 */
public class SquareOrNot {

    public static void squareOrNotOfAnInputNumber(int input) {

        if (input % 10 == 2 || input % 10 == 3 || input % 10 == 7 || input % 10 == 8) {
            System.out.println("This is not a perfect Square!!");
            return;
        }

        double sqrtNumber = Math.sqrt(input);

        if (Math.ceil(sqrtNumber) != Math.floor(sqrtNumber)) {
            System.out.println("This is not a perfect Square!!");
        } else {
            System.out.println("Input is a perfect Square!");
        }
    }
}
