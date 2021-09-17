package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {

    public static void primeNumber(int start, int end) {

        for (int i = start; i <= end; i++) {
            // checking number prime or not
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, count;
        System.out.println("Enter Starting Number : ");
        start = sc.nextInt();
        System.out.println("Enter Ending Number : ");
        end = sc.nextInt();

        primeNumber(start, end);
    }
}
