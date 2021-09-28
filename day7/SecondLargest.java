package com.bridgelabz.day7;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        int arrayLength, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want:");
        arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayLength; i++)
        {
            for (int j = i + 1; j < arrayLength; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+array[arrayLength-2]);
        System.out.println("Second Smallest:"+array[1]);
    }
}
