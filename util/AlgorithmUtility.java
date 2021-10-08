package com.bridgelabz.util;

import java.util.Arrays;

public class AlgorithmUtility {

    /**
     * check string is anagram or not
     * @param str1
     * @param str2
     * @return
     */
    public boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    /**
     * check prime number
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * check number isPalindrome
     * @param num
     * @return
     */
    public boolean isPalindrome(int num) {
        int r, sum = 0;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}
