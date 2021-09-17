package com.bridgelabz.day2;

public class ProduceRunTimeError {
    public void print(String string) {
        System.out.println(string);
    }

}
class Main{

    public static void main(String[] args) {

        ProduceRunTimeError object = new ProduceRunTimeError();
        object.print("hello world");
    }
}
