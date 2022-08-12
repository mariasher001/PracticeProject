package com.practice.PractiseQuestions;

import java.util.Locale;

public class ValidPalindromePhrase {
    /**
     * A phrase is a palindrome if,
     * after converting all uppercase letters into lowercase letters,
     * removing all non-alphanumeric characters (Alphanumeric characters include letters and numbers),
     * it reads the same forward and backward.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     *
     * @Parameter : String
     * @Return Value: boolean
     */
    public static boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


}
