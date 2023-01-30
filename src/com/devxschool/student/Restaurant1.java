package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class Restaurant1 {
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
        //double taxFee = 0.1;
        System.out.println("Please, enter number of guests:");
        int numberOfGuests = scanner.nextInt();
        System.out.println("Enter a restaurant bill amount: ");
        double billAmount = scanner.nextDouble();
        System.out.println("Is your check split?");
        boolean isSplit = scanner.nextBoolean();
        System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)");
        String serviceQuality = scanner.next();
        double totalAmount = 0;
        double totalAmountPerGuest = 0;
        if (serviceQuality.equalsIgnoreCase("perfect") || serviceQuality.equalsIgnoreCase("good")
                || serviceQuality.equalsIgnoreCase("ok") || serviceQuality.equalsIgnoreCase("bad")) {
            totalAmount = getTotalAmount(serviceQuality, billAmount);
            System.out.println("Total amount:" + totalAmount);
            if (isSplit) {
                System.out.println("Number of guests:" + numberOfGuests);
                totalAmountPerGuest = getTotalPerGuest(totalAmount, numberOfGuests);
                System.out.println("Total per guest:" + totalAmountPerGuest);
            }
        } else {
            System.out.println("Wrong input!");
        }
        // ignore this
        Validation.testBill(numberOfGuests, billAmount, isSplit, serviceQuality, totalAmount, totalAmountPerGuest);
    }

    /* double multiplication error - precise
    public static double getTotalAmount(double billAmount) {
        double totalAmount;
        double totalAmountAfterTax = billAmount * 1.10;
        totalAmount = totalAmountAfterTax * 1.25;
        return totalAmount;
    }*/

    public static double getTotalAmount(String serviceQuality, double billAmount) {
        double totalAmount;
        double billIncludingTips = 0;
        switch (serviceQuality.toLowerCase()) {
            case "perfect":
                billIncludingTips = billAmount * 0.25 + billAmount;
                break;
            case "good":
                billIncludingTips = billAmount * 0.2 + billAmount;
                break;
            case "ok":
                billIncludingTips = billAmount * 0.15 + billAmount;
                break;
            case "bad":
                billIncludingTips = billAmount * 0.1 + billAmount;
                break;
        }
        totalAmount = billIncludingTips * 1.1;
        return totalAmount;
    }

    public static double getTotalPerGuest(double totalAmount, int numberOfGuests) {
        double totalPerGuest;
        totalPerGuest = totalAmount / numberOfGuests;
        return totalPerGuest;
    }

}
