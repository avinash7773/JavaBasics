package com.bridgelabz.day1;

import java.util.Scanner;

public class PrintThreeNames {

    public static void reverse(String[] array) {

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length");
        int arrayLength = sc.nextInt();

        String array[] = new String[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = sc.next();
        }
        reverse(array);
    }
}
