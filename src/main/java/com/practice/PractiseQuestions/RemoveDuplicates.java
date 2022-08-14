package com.practice.PractiseQuestions;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 */

import java.util.Arrays;

/**
 * Solution: Sorted arrays duplicate remain together so use i to remain at the last sorted and non-duplicate elements
 * while use j to traverse through the array looking for duplicate elements.
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j =1;

        while(j < nums.length){
            if(nums[i] == nums[j]){
                j++;
            } else if (nums[i]!= nums[j]) {
                nums[i+1] =  nums[j];
                i++;
                j++;
            }
        }
        System.out.println(i+1);
        return i+1;
    }
}
