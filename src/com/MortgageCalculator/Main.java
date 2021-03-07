package com.MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        System.out.println("Mortgage Calculator");
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments)) /
                (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);
        System.out.println("Your Mortgage monthly payment is:   " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
