package com.java.fundamentals;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte mathsMarks,scienceMarks,teluguMarks,hindiMarks,englishMarks,socialMarks;
        System.out.println("Enter Maths Marks : ");
        mathsMarks = sc.nextByte();
        System.out.println("Enter Science Marks : ");
        scienceMarks = sc.nextByte();
        System.out.println("Enter Telugu Marks : ");
        teluguMarks = sc.nextByte();
        System.out.println("Enter Hindi Marks : ");
        hindiMarks = sc.nextByte();
        System.out.println("Enter English Marks : ");
        englishMarks = sc.nextByte();
        System.out.println("Enter Social Marks : ");
        socialMarks = sc.nextByte();
        short totalMarks;
        totalMarks = (short) (mathsMarks+scienceMarks+teluguMarks+hindiMarks+englishMarks+socialMarks);
        System.out.println("Total Marks of Students : " +totalMarks);
        double avgMarks;
        avgMarks =(double) totalMarks/6;
        System.out.println("Average Marks of Students : " + avgMarks);
        sc.close();
    }
}
