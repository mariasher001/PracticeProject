package com.practice.PractiseQuestions;

public class Patterns {

    /**
     * Draw a pattern.
     * *
     * **
     * ***
     * ****
     * *****
     */
    public static void printPattern(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    /**
     * *****
     * ****
     * ***
     * **
     * *
     *
     * @param numberOfStars
     */
    public static void reversePrintPattern(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < numberOfStars - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printPyramid(int numberOfStars) {
        /**
         *          *
         *         ***
         *        *****
         *       *******
         *      *********
         */
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < numberOfStars - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printReversePyramid(int numberOfStars) {
        /**
         *      *********
         *       *******
         *        *****
         *         ***
         *          *
         */
        for(int i=0;i<=numberOfStars;i++){
            //space
            for(int j = numberOfStars;j>numberOfStars-i;j--){
                System.out.print(" ");
            }
            //stars
            for (int j =0 ;j<numberOfStars-i;j++){
                System.out.print("*");
            }
            // stars2
            for(int j=1;j<numberOfStars-i;j++ ){
                System.out.print("*");
            }
            System.out.println("");

        }


    }
}
