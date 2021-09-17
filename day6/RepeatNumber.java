package com.bridgelabz.day6;

import java.util.Scanner;

public class RepeatNumber {

    public static void repeateNumber(int[] array, int arrayLength){

        int[] outputArray = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            for(int j = i+1; j < arrayLength; j++) {
                if(array[i] == array[j]) {
                   System.out.print(array[i]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length=");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Enter "+(i+1) +" element=");
            array[i] = sc.nextInt();
        }

        repeateNumber(array, arrayLength);
    }
}
