package com.bridgelabz.day9;

import com.bridgelabz.util.MathFunction;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        MathFunction.fact(number);
    }
}
