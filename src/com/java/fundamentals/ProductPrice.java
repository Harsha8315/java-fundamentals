package com.java.fundamentals;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float discountPercentage, stateTax, centralTax, discountAmount, stateTaxAmount, centralTaxAmount,afterDiscountPrice,totalTaxAmount,finalProductPrice,finalBill, totalSaved;
        int productPrice, quantity;
        System.out.println("Enter Product Price : ");
        productPrice = sc.nextInt();
        System.out.println("Enter Discount Percentage : ");
        discountPercentage = sc.nextFloat();
        discountAmount= (productPrice*discountPercentage)/100;
        afterDiscountPrice =(float) productPrice-discountAmount;
        stateTax = 2.5F;
        stateTaxAmount = (float) (afterDiscountPrice*2.5)/100;
        centralTax = 2.5F;
        centralTaxAmount = (float) (afterDiscountPrice*2.5)/100;
        totalTaxAmount = (float) stateTaxAmount+centralTaxAmount;
        finalProductPrice= (float) afterDiscountPrice+totalTaxAmount;
        System.out.println("Product Price : " + productPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Discounted Product Price : " + afterDiscountPrice);
        System.out.println("State Tax Amount : " + stateTaxAmount);
        System.out.println("Central Tax Amount : " + centralTaxAmount);
        System.out.println("Final Product Price : " + finalProductPrice);
        System.out.println("Enter Quamtity : ");
        quantity= sc.nextInt();
        finalBill = (float) quantity*finalProductPrice;
        totalSaved = (float) quantity*discountAmount;
        System.out.println("FinalBill : " + finalBill);
        System.out.println("TotalSaved : " + totalSaved);
        sc.close();
    }
}
