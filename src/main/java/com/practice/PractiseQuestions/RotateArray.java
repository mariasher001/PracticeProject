package com.practice.PractiseQuestions;

import java.util.Arrays;

public class RotateArray {
    public static void rotate1(int[] nums, int k) {
        /**
         * Solution:
         * Save the last element
         * For loop for reversing the array
         * Add the last element at array[0]
         * Not a O(1) solution.
         */

        int count, lastElement = -1;
        for (count = nums.length - k - 1; count < nums.length - 1; count++) {
            lastElement = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = lastElement;

        }
        //Displaying the loop.

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotateWithConstantSpaceComplexity(int[] nums, int k) {
        //split from where you want to reverse
        //Reverse both sub-arrays
        // reverse together
        k %= nums.length;

        reverseArray(0, nums.length - 1, nums);
        reverseArray( 0,k-1, nums);
        reverseArray(k, nums.length-1, nums);



        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    private static void reverseArray(int start, int end, int[] nums) {
        int temp = 0;
        while( start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;


        }
    }

}
