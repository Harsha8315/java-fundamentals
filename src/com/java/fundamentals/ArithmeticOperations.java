package com.java.fundamentals;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte no1,no2;
        System.out.println("Enter the no1 : ");
        no1 = sc.nextByte();
        System.out.println("Enter the no2 : ");
        no2 = sc.nextByte();
        short res;
        res = (short) (no1+no2);
        System.out.println("Result : " + res);
        sc.close();
    }
}
