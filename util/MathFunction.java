package com.bridgelabz.util;

public class MathFunction {

    public static void harmonicSeries(int num) {
        for ( int count = 1 ; count<= num ; count++ ) {
            if(count == num) {
                System.out.print(" 1/" +count);
            }
            else
                System.out.print(" 1/" +count+ " + ");
        }
    }
    /*
     * return a sin of an angle
     */

    public static void isSin(double degreesSin) {
        double radians = Math.toRadians(degreesSin);
        double sinValue = Math.sin(radians);

        System.out.println("sin(" +degreesSin+ ") =" +sinValue);
    }

    /*
     * return a Cos of an angle
     */

    public static void isCos(double degreesCos) {
        double radians = Math.toRadians(degreesCos);
        double cosValue = Math.cos(radians);
        System.out.println("sin(" +degreesCos+ ") =" +cosValue);
    }



    /**
     * check number is prime or not
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
     * find factorial of number
     * @param number
     * @return
     */
    public static int fact(int number)
    {
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
            System.out.println("The factorial of the number is: " + factorial);
        }
        return factorial;
    }
}
