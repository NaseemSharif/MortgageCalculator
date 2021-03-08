package com.MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        int principal;
        System.out.println("Mortgage Calculator");
        while(true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.print("Please enter a number between (1000 and 1000): ");
        }
        float annualInterest;
        float monthlyInterest;
        while (true){
        System.out.print("Annual Interest: ");
        annualInterest = scanner.nextFloat();
        if (annualInterest >= 0 && annualInterest <= 30) {
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            break;
        }
            System.out.print("Please enter an interest rate between (0 - 30): ");
        }

        byte years;
        int numberOfPayments;
        while(true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.print("Please enter a year between (1 - 30): ");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments)) /
                (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);
        System.out.println("Your Mortgage monthly payment is: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
