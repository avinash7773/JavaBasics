package com.bridgelabz.day17;

import java.util.Scanner;

public class PrimePalindrome {

    int startNUmber, lastNumber,count,rev;

    /**
     * taking input from user
     */
    void takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number: ");
        startNUmber=sc.nextInt();
        System.out.println("Enter the last number: ");
        lastNumber=sc.nextInt();
    }

    /**
     * find prime palindrome number
     */
    void primePalindrome()
    {
        int num, temp, i;
        System.out.println("The prime palindrome number are : ");
        for(num = startNUmber; num <= lastNumber; num++){
            count = 0;
            rev = 0;
            temp = num;

            //checking for prime number
            for(i= 1; i <= temp; i++){
                //counting the number of factors of the number
                if(temp%i==0)
                    count++;
            }

            //if the number is prime check for palindrome
            if(count == 2) {
                //reversing the number
                while(temp > 0) {
                    rev = rev*10+(temp%10);
                    temp = temp/10;
                }
                //checking for the prime palindrome number
                if(rev == num)
                    System.out.println(num+" ");
            }
        }
    }

    public static void main(String[] args) {

        PrimePalindrome object = new PrimePalindrome();
        object.takeInput();
        object.primePalindrome();
    }
}
