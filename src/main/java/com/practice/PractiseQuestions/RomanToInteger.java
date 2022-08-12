package com.practice.PractiseQuestions;

import java.util.HashMap;

/**
 * Given a roman numeral, convert it to an integer.
 * Input: s = "XIX"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 */

/**
 * Solution: 1) map char to int using hashmap
 *           2) compare i and i-1 starting from i=1 is i-1 is smaller then i than subtract i-1 from sum
 *           3) if i-1 > i then add i-1 to sum
 *           4) return sum + value of the last digit
 */
public class RomanToInteger {
    public static int romanToInt(String s) {

        int integerValue = 0;

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        for (int i = 1 ; i <= s.length()-1 ; i++) {
            if(hashMap.get(s.charAt(i)) > hashMap.get(s.charAt(i-1))){
                integerValue = integerValue  - hashMap.get(s.charAt(i-1)) ;
            }
            else if (hashMap.get(s.charAt(i)) <= hashMap.get(s.charAt(i-1))){
                integerValue = integerValue + hashMap.get(s.charAt(i-1));
            }
        }
        System.out.println(integerValue + hashMap.get(s.charAt(s.length()-1)));
        return integerValue + hashMap.get(s.charAt(s.length()-1));

    }
}
