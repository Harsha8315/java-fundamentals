package com.java.fundamentals;

import java.util.Scanner;

public class LoopsProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float discountPercentage, stateTax, centralTax, discountAmount, stateTaxAmount, centralTaxAmount, priceAfterDiscount, totalTaxAmount, finalProductPrice, finalBill, totalSaved;
        int productPrice, quantity;
        byte shipmentCharges;
        char membership, menu, continueShopping;
        short availableStock = 100;
        stateTax = 2.5F;
        centralTax = 2.5F;
        continueShopping = 'Y';
        do{
        System.out.println("WELCOME TO ECOMMERCE WEBSITE");
        System.out.println("1. Product ");
        System.out.println("2. Exit ");
        System.out.println("Please Enter Your Input : ");
        menu = sc.next().charAt(0);
        switch (menu){
            case '1':
                System.out.println("Welcome To Products Section");
                System.out.println("Enter Product Price : ");
                productPrice = sc.nextInt();
                System.out.println("Enter Membership (D/G/S/N[NoMembership]) : ");
                membership = sc.next().charAt(0);
                switch (membership) {
                    case 'D':
                        discountPercentage = 20;
                        shipmentCharges = 0;
                        break;
                    case 'G':
                        discountPercentage = 15;
                        shipmentCharges = 20;
                        break;
                    case 'S':
                        discountPercentage = 10;
                        shipmentCharges = 50;
                        break;
                    default:
                        discountPercentage = 0;
                        shipmentCharges = 100;

                }
                discountAmount = (productPrice * discountPercentage) / 100;
                priceAfterDiscount = (float) productPrice - discountAmount;
                stateTaxAmount = (float) (priceAfterDiscount * 2.5) / 100;
                centralTaxAmount = (float) (priceAfterDiscount * 2.5) / 100;
                totalTaxAmount = (float) stateTaxAmount + centralTaxAmount;
                finalProductPrice = (float) priceAfterDiscount + totalTaxAmount;
                finalProductPrice = (float) priceAfterDiscount + totalTaxAmount;
                System.out.println("Product Price : " + productPrice);
                System.out.println("Discount Percentage : " + discountPercentage);
                System.out.println("Discount Amount : " + discountAmount);
                System.out.println("Discounted Product Price : " + priceAfterDiscount);
                System.out.println("Shipment Charges : " + shipmentCharges);
                System.out.println("State Tax Amount : " + stateTaxAmount);
                System.out.println("Central Tax Amount : " + centralTaxAmount);
                System.out.println("Final Product Price : " + finalProductPrice);
                System.out.println("Enter Quamtity : ");
                quantity = sc.nextInt();
                if(quantity <= availableStock) {
                    finalBill = (float) quantity * finalProductPrice;
                    totalSaved = (float) quantity * discountAmount;
                    System.out.println("FinalBill : " + finalBill);
                    System.out.println("TotalSaved : " + totalSaved);
                    availableStock -= quantity ;
                }else{
                    System.out.println("Stock is Unavailable");
                    System.out.println("The Available Stock is : " + availableStock);
                }
            break;
            case '2':
                System.out.println("You Have Exited From Website");
                System.exit(0);
        }
            System.out.println("Thank You for Shopping");
            System.out.println("Do You Want to Continue");
            continueShopping = sc.next().charAt(0);
        } while (continueShopping == 'Y');
        sc.close();
    }
}





