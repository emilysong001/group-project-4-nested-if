package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class JoliesRestaurant {
    public static void main(String[] args) {
        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */

        Scanner scanner = new Scanner(System.in);
        int numberOfGuests = 0;
        double billAmount = 0;
        double taxFee = 0.1;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;
        /*System.out.println("Welcome to Jolie's Restaurant!!!");
        System.out.println("Enter number of guests:");
        numberOfGuests = scanner.nextInt();
        System.out.println("Enter a restaurant bill amount:");
        billAmount = scanner.nextDouble();
        System.out.println("Is your check split?");
        isSplit = scanner.nextBoolean();
        System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)");
        scanner.nextLine();
        serviceQuality = scanner.nextLine();
        System.out.println("Number of guests: " + numberOfGuests);
        //taxFee = 0.1;

        System.out.println("===============");
        totalAmount = tips(serviceQuality,billAmount);
        System.out.println(totalAmount);
        System.out.println("Total amount: ");
        System.out.printf("%.1f%n", totalAmount);

        if (isSplit) {
            System.out.println("Total per guest: " + totalAmount / numberOfGuests);
        }


        //TODO write your code here


        // ignore this
        Validation.testBill(numberOfGuests, billAmount, isSplit, serviceQuality, totalAmount, totalAmountPerGuest);

    }

    public static double tips(String serviceQuality,double billAmount) {
        double totalAmount = 0;
        switch (serviceQuality) {
            case "perfect":
                totalAmount = (double)(billAmount * 1.1 * 1.25);
            case "good":
                totalAmount = billAmount * 1.1 * 1.2;
            case "ok":
                totalAmount = billAmount * 1.1 * 1.15;
            case "bad":
                totalAmount = billAmount * 1.1 * 1.1;
        }
        return totalAmount;
    }*/

        System.out.println("Please, enter number of guests:");
        numberOfGuests = scanner.nextInt();
        System.out.println("Enter a restaurant bill amount: ");
        billAmount = scanner.nextDouble();
        System.out.println("Is your check split?");
        isSplit = scanner.nextBoolean();
        if (isSplit) {
            System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)");
            serviceQuality = scanner.next();
            if (serviceQuality.equalsIgnoreCase("bad")) {
                double billIncludingTips = ((billAmount * 0.1) + billAmount);
                totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Number of guests:" + numberOfGuests);
                System.out.println("Total amount:" + totalAmount);
                System.out.println("Total per guest:" + totalAmountPerGuest);
            } else if (serviceQuality.equalsIgnoreCase("ok")) {
                double billIncludingTips = billAmount * 0.15 + billAmount;
                totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Number of guests:" + numberOfGuests);
                System.out.println("Total amount:" + totalAmount);
                System.out.println("Total per guest:" + totalAmountPerGuest);
            } else if (serviceQuality.equalsIgnoreCase("good")) {
                double billIncludingTips = billAmount * 0.2 + billAmount;
                totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Number of guests:" + numberOfGuests);
                System.out.println("Total amount:" + totalAmount);
                System.out.println("Total per guest:" + totalAmountPerGuest);
            } else if (serviceQuality.equalsIgnoreCase("perfect")) {
                double billIncludingTips = billAmount * 0.25 + billAmount;
                totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Number of guests:" + numberOfGuests);
                System.out.println("Total amount:" + totalAmount);
                System.out.println("Total per guest:" + totalAmountPerGuest);
            } else {
                System.out.println("Wrong input!");
            }
        } else {
            System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)");
            serviceQuality = scanner.next();
            if (serviceQuality.equalsIgnoreCase("bad")) {
                double billIncludingTips = ((billAmount * 0.1) + billAmount);
                //totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Total amount:" + totalAmount);
            } else if (serviceQuality.equalsIgnoreCase("ok")) {
                double billIncludingTips = billAmount * 0.15 + billAmount;
                //totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Total amount:" + totalAmount);
            } else if (serviceQuality.equalsIgnoreCase("good")) {
                double billIncludingTips = billAmount * 0.2 + billAmount;
                //totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Total amount:" + totalAmount);
            } else if (serviceQuality.equalsIgnoreCase("perfect")) {
                double billIncludingTips = billAmount * 0.25 + billAmount;
                //totalAmountPerGuest = billIncludingTips * 1.1 / numberOfGuests;
                totalAmount = billIncludingTips * 1.1;
                System.out.println("Total amount:" + totalAmount);
            } else {
                System.out.println("Wrong input!");
            }


        }
    }
}
