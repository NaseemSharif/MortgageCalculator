package com.MortgageCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mortgage Calculator");
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / 100 / 12;
        System.out.print("How Many Years: ");
        byte years = scanner.nextByte();
        int months = years * 12;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,months)) /
                (Math.pow(1+ monthlyInterest, months) - 1);
        System.out.println("Your monthly payment is " + mortgage);

    }
}
