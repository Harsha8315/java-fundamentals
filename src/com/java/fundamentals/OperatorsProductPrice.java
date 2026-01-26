package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsProductPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float discountPercentage = 0, stateTax, centralTax, discountAmount, stateTaxAmount, centralTaxAmount,afterDiscountPrice,totalTaxAmount,finalProductPrice,finalBill, totalSaved;
        int productPrice, quantity;
        byte shipmentCharges = 0;
        char membership, s, g, d , n;
        System.out.println("Enter Product Price : ");
        productPrice = sc.nextInt();
        System.out.println("Enter Membership (S/G/D/N[NoMembership]) : ");
        membership = sc.next().charAt(0);
        if (membership == 's') {
            discountPercentage = 10;
            shipmentCharges = 50;
        } else if (membership == 'g') {
            discountPercentage = 15;
            shipmentCharges = 20;
        } else if (membership == 'd') {
            discountPercentage = 20;
            shipmentCharges = 0;
        } else if (membership == 'n') {
            discountPercentage = 0;
            shipmentCharges = 50;

        } else{
            System.out.println("Enter Valid Membership");
            return;
        }
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
        System.out.println("Shipment Charges : " + shipmentCharges);
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
