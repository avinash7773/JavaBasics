package com.bridgelabz.day1;

import java.util.Scanner;

public class LeapYear {

    /**
     * this is for checking year is leap or not
     * @param year
     * @return boolean value
     */
    private static boolean leapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");

        int year = sc.nextInt();
        boolean result = leapYear(year);

        if(result == true)
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is not leap year");
    }
}
