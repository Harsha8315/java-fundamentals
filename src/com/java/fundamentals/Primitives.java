package com.java.fundamentals;

public class Primitives {
    public static  void main(String[] args){
        byte deliveryRating, itemsInCart, discountPercent, deliveryTime, deliveryBoyRank;
        deliveryRating = 5;
        itemsInCart = 12;
        discountPercent = 25;
        deliveryTime = 15;
        deliveryBoyRank = 10;

        System.out.println("Delivery Rating : " + deliveryRating);
        System.out.println("Items In Cart : " + itemsInCart);
        System.out.println("Discount Percent : " + discountPercent);
        System.out.println("Delivery Time : " + deliveryTime);
        System.out.println("Delivery Boy Rank : " + deliveryBoyRank);
        System.out.println();

        short customerId, orderNumber, totalBillAmount, couponsAvailable, deliveryPartners;
        customerId = 12345;
        orderNumber = 5678;
        totalBillAmount = 2450;
        couponsAvailable = 1500;
        deliveryPartners = 3200;

        System.out.println("Customer ID : " + customerId);
        System.out.println("Order Number : " + orderNumber);
        System.out.println("Total Bill Amount : " + totalBillAmount);
        System.out.println("Coupons Available : " + couponsAvailable);
        System.out.println("Delivery Partners : " + deliveryPartners);
        System.out.println();

        int dailyOrders, totalUsers, totalProducts, monthlyRevenue, appDownloads;
        dailyOrders = 250000;
        totalUsers = 15000000;
        totalProducts = 500000;
        monthlyRevenue = 75000000;
        appDownloads = 80000000;

        System.out.println("Daily Orders : " + dailyOrders);
        System.out.println("Total Users : " + totalUsers);
        System.out.println("Total Products : " + totalProducts);
        System.out.println("Monthly Revenue : " + monthlyRevenue);
        System.out.println("App Downloads : " + appDownloads);
        System.out.println();

        long yearlyOrders, companyValuation, totalDeliveryDistance, totalTransactions;
        yearlyOrders = 5000000000L;
        companyValuation = 100000000000L;
        totalDeliveryDistance = 999999999999L;
        totalTransactions = 8888888888888L;

        System.out.println("Yearly Orders : " + yearlyOrders);
        System.out.println("Company Valuation : " + companyValuation);
        System.out.println("Total Delivery Distance : " + totalDeliveryDistance);
        System.out.println("Total Transactions : " + totalTransactions);
        System.out.println();
        float avgDeliveryTime, avgCustomerRating, productWeight, walletBalance;
        avgDeliveryTime = 12.5f;
        avgCustomerRating = 4.6f;
        productWeight = 1.25f;
        walletBalance = 350.75f;

        System.out.println("Avg Delivery Time : " + avgDeliveryTime);
        System.out.println("Avg Customer Rating : " + avgCustomerRating);
        System.out.println("Product Weight : " + productWeight);
        System.out.println("Wallet Balance : " + walletBalance);
        System.out.println();

        double totalOrderPrice, distanceToCustomer, yearlyRevenue, deliveryCharge, platformFee;
        totalOrderPrice = 1250.75;
        distanceToCustomer = 5.756;
        yearlyRevenue = 7896543210.55;
        deliveryCharge = 29.99;
        platformFee = 5.50;

        System.out.println("Total Order Price : " + totalOrderPrice);
        System.out.println("Distance To Customer : " + distanceToCustomer);
        System.out.println("Yearly Revenue : " + yearlyRevenue);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Platform Fee : " + platformFee);
        System.out.println();

        char feedback = 'A';
        System.out.println("Feedback : " + feedback);
    }
}
