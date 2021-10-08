package com.bridgelabz.day9;

import com.bridgelabz.util.MathFunction;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        if(MathFunction.isPrime(number)) {
            System.out.println(number+" is prime number");
        }else {
            System.out.println(number+" is not prime");
        }
    }
}
