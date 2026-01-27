package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsProductPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float discountPercentage = 0, StateTax, CentralTax, discountAmount, StateTaxAmount, CentralTaxAmount,afterDiscountPrice,totalTaxAmount,finalProductPrice,finalBill, totalSaved;
        int productPrice, quantity;
        byte shipmentCharges = 0;
        char membership, S, G, D , N;
        CentralTax = 2.5F;
        StateTax = 2.5F;
        System.out.println("Enter Product Price : ");
        productPrice = sc.nextInt();
        System.out.println("Enter Membership (D/G/S/N[NoMembership]) : ");
        membership = sc.next().charAt(0);
        if (membership == 'D') {
            discountPercentage = 20;
            shipmentCharges = 0;
        } else if (membership == 'G') {
            discountPercentage = 15;
            shipmentCharges = 20;
        } else if (membership == 'S') {
            discountPercentage = 10;
            shipmentCharges = 50;
        } else if (membership == 'N') {
            discountPercentage = 0;
            shipmentCharges = 100;

        } else{
            System.out.println("Enter Valid Membership");
            return;
        }
        discountAmount= (productPrice*discountPercentage)/100;
        afterDiscountPrice =(float) productPrice-discountAmount;
        StateTaxAmount = (float) (afterDiscountPrice*2.5)/100;
        CentralTaxAmount = (float) (afterDiscountPrice*2.5)/100;
        totalTaxAmount = (float) StateTaxAmount+CentralTaxAmount;
        finalProductPrice= (float) afterDiscountPrice+totalTaxAmount;
        System.out.println("Product Price : " + productPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Discounted Product Price : " + afterDiscountPrice);
        System.out.println("Shipment Charges : " + shipmentCharges);
        System.out.println("State Tax Amount : " + StateTaxAmount);
        System.out.println("Central Tax Amount : " + CentralTaxAmount);
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
