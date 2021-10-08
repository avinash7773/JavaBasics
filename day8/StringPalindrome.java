package com.bridgelabz.day8;

import java.util.Scanner;

public class StringPalindrome {

    /**
     * check given string is palindrome
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str)
        {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;

                i++;
                j--;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the word");
            String str = sc.next();
            if (isPalindrome(str))
                System.out.print("Yes, its palindrome");
            else
                System.out.print("No,its not palindrome");

        }
}
