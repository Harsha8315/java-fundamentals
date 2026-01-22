package com.java.fundamentals;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte deliveryRating, itemsInCart, discountPercent, deliveryTime, deliveryBoyRank;

        System.out.println("Enter Delivery Rating : ");
        deliveryRating = sc.nextByte();

        System.out.println("Enter Items In Cart : ");
        itemsInCart = sc.nextByte();

        System.out.println("Enter Discount Percent : ");
        discountPercent = sc.nextByte();

        System.out.println("Enter Delivery Time : ");
        deliveryTime = sc.nextByte();

        System.out.println("Enter Delivery Boy Rank : ");
        deliveryBoyRank = sc.nextByte();

        System.out.println("Delivery Rating : " + deliveryRating);
        System.out.println("Items In Cart : " + itemsInCart);
        System.out.println("Discount Percent : " + discountPercent);
        System.out.println("Delivery Time : " + deliveryTime);
        System.out.println("Delivery Boy Rank : " + deliveryBoyRank);

        short customerId, orderNumber, totalBillAmount, couponsAvailable, deliveryPartners;

        System.out.println("Enter Customer ID : ");
        customerId = sc.nextShort();

        System.out.println("Enter Order Number : ");
        orderNumber = sc.nextShort();

        System.out.println("Enter Total Bill Amount : ");
        totalBillAmount = sc.nextShort();

        System.out.println("Enter Coupons Available : ");
        couponsAvailable = sc.nextShort();

        System.out.println("Enter Delivery Partners : ");
        deliveryPartners = sc.nextShort();

        System.out.println("Customer ID : " + customerId);
        System.out.println("Order Number : " + orderNumber);
        System.out.println("Total Bill Amount : " + totalBillAmount);
        System.out.println("Coupons Available : " + couponsAvailable);
        System.out.println("Delivery Partners : " + deliveryPartners);

        int dailyOrders, totalUsers, totalProducts, monthlyRevenue, appDownloads;

        System.out.println("Enter Daily Orders : ");
        dailyOrders = sc.nextInt();

        System.out.println("Enter Total Users : ");
        totalUsers = sc.nextInt();

        System.out.println("Enter Total Products : ");
        totalProducts = sc.nextInt();

        System.out.println("Enter Monthly Revenue : ");
        monthlyRevenue = sc.nextInt();

        System.out.println("Enter App Downloads : ");
        appDownloads = sc.nextInt();

        System.out.println("Daily Orders : " + dailyOrders);
        System.out.println("Total Users : " + totalUsers);
        System.out.println("Total Products : " + totalProducts);
        System.out.println("Monthly Revenue : " + monthlyRevenue);
        System.out.println("App Downloads : " + appDownloads);

        long yearlyOrders, companyValuation, totalDeliveryDistance, totalTransactions;

        System.out.println("Enter Yearly Orders : ");
        yearlyOrders = sc.nextLong();

        System.out.println("Enter Company Valuation : ");
        companyValuation = sc.nextLong();

        System.out.println("Enter Total Delivery Distance : ");
        totalDeliveryDistance = sc.nextLong();

        System.out.println("Enter Total Transactions : ");
        totalTransactions = sc.nextLong();

        System.out.println("Yearly Orders : " + yearlyOrders);
        System.out.println("Company Valuation : " + companyValuation);
        System.out.println("Total Delivery Distance : " + totalDeliveryDistance);
        System.out.println("Total Transactions : " + totalTransactions);

        float avgDeliveryTimeF, avgCustomerRating, productWeight, walletBalance;

        System.out.println("Enter Avg Delivery Time : ");
        avgDeliveryTimeF = sc.nextFloat();

        System.out.println("Enter Avg Customer Rating : ");
        avgCustomerRating = sc.nextFloat();

        System.out.println("Enter Product Weight : ");
        productWeight = sc.nextFloat();

        System.out.println("Enter Wallet Balance : ");
        walletBalance = sc.nextFloat();

        System.out.println("Avg Delivery Time : " + avgDeliveryTimeF);
        System.out.println("Avg Customer Rating : " + avgCustomerRating);
        System.out.println("Product Weight : " + productWeight);
        System.out.println("Wallet Balance : " + walletBalance);

        double totalOrderPrice, distanceToCustomer, yearlyRevenue, deliveryCharge, platformFee;

        System.out.println("Enter Total Order Price : ");
        totalOrderPrice = sc.nextDouble();

        System.out.println("Enter Distance To Customer : ");
        distanceToCustomer = sc.nextDouble();

        System.out.println("Enter Yearly Revenue : ");
        yearlyRevenue = sc.nextDouble();

        System.out.println("Enter Delivery Charge : ");
        deliveryCharge = sc.nextDouble();

        System.out.println("Enter Platform Fee : ");
        platformFee = sc.nextDouble();

        System.out.println("Total Order Price : " + totalOrderPrice);
        System.out.println("Distance To Customer : " + distanceToCustomer + " km");
        System.out.println("Yearly Revenue : " + yearlyRevenue);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Platform Fee : " + platformFee);

        char feedback;

        System.out.println("Enter Feedback Grade (A/B/C) : ");
        feedback = sc.next().charAt(0);

        System.out.println("Feedback : " + feedback);

        sc.close();

    }
}
