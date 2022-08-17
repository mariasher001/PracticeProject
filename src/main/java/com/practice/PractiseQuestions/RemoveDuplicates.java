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
        int j = 1;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }

        return i + 1;
    }

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove some duplicates in-place such that each unique element appears at most twice.
     * The relative order of the elements should be kept the same.
     */
    public static int removeDuplicatesAppearingMoreThanTwice(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                count++;
                j++;
            } else {
                if (count > 2) {
                    nums[i + 1] = nums[j];
                    i++;
                    count = 0;
                }
            }

        }
        System.out.println(i + 1);
        return i + 1;
    }

    public static int removeDuplicates1(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
                count++;
            } else {
                if (count == 1) {
                    j++;
                    i++;
                } else if (count == 2) {
                    nums[i + 2] = nums[j];
                    j++;
                    i += 2;
                } else {
                    nums[i + 2] = nums[j];
                    j++;
                    i += 2;
                }
                count = 1;
            }
        }
        if(count < 2) {
            i+=count;
        } else {
            i+=2;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println(i);
        return i;
    }

}
