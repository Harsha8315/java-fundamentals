package com.java.fundamentals;

import java.util.Scanner;
public class OperatorsStudentScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte mathsMarks,scienceMarks,teluguMarks,hindiMarks,englishMarks,socialMarks;
        short totalMarks;
        double avgMarks;
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
        totalMarks = (short) (mathsMarks+scienceMarks+teluguMarks+hindiMarks+englishMarks+socialMarks);
        avgMarks =(double) totalMarks/6;
        System.out.println("Telugu Marks : " + teluguMarks);
        System.out.println("Hindi Marks : " + hindiMarks);
        System.out.println("English Marks : " + englishMarks);
        System.out.println("Maths Marks : " + mathsMarks);
        System.out.println("Science Marks : " + scienceMarks);
        System.out.println("Social Marks : " + socialMarks);
        System.out.println("Total Marks of Students : " +totalMarks);
        System.out.println("Average Marks of Students : " + avgMarks);
        if (avgMarks>90 && avgMarks<100 ){
            System.out.println("Grade : O");
        } else if (avgMarks>80 && avgMarks<90) {
            System.out.println(" Grade : A");
        } else if (avgMarks>70 && avgMarks<80) {
            System.out.println("Grade : B");
        } else if (avgMarks > 60 && avgMarks<70) {
            System.out.println("Grade : C");
        } else if (avgMarks>50 && avgMarks<60) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }
        sc.close();
    }
}
