package com.pluralsight;


import java.util.Scanner;

public class FinancialCalculators {
// lowerCamelCase is for Variable names
// UpperCamelcase is for the Class name
// snake_case is for projects or directories
// kebab-case is for projects or directories
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the Financial Calculator!");
        System.out.println(" (M) Mortgage Calculator ");
        System.out.println(" (F) Future Value Calculator ");
        System.out.print("To begin, please select a Calculator: ");
        String calculatorType = myScanner.nextLine();

         System.out.println();


        if (calculatorType.equalsIgnoreCase("M")) {

        System.out.println("Welcome to the Mortgage Calculator!");
        System.out.println("To begin, enter the principal of your loan: ");
            double principal = myScanner.nextDouble();
        System.out.println("Enter the interest rate: ");
            double interest = myScanner.nextDouble();
        System.out.println("Enter the time length of your loan (yrs): ");
            double loanTime = myScanner.nextDouble();
            double monthlyInterest = interest / 100 / 12;
            double numberPayment = loanTime * 12;
            double inResults = Math.pow(1 + monthlyInterest, numberPayment);
            double monthlyPayment = principal * (monthlyInterest * inResults / (inResults - 1));
            double totalPayment = monthlyPayment * numberPayment;
            double totalInterest = totalPayment - principal;

            System.out.printf("The Monthly Payment is: $%.2f\n", monthlyPayment);;
            System.out.printf("The Interest is: $%.2f\n", totalInterest);
        }

       else if (calculatorType.equalsIgnoreCase("F")) {
            System.out.println("Welcome to the Future Value Calculator!");
            System.out.println("To begin, enter the deposit amount: ");
            double PV = myScanner.nextDouble();
            System.out.println("Enter the interest rate: ");
            double interestRate = myScanner.nextDouble();
            System.out.println("Enter the number of years: ");
            double numYr = myScanner.nextDouble();
            interestRate /= 100;
            interestRate += 1;
           double FV = Math.pow(interestRate, numYr);
            FV *= PV;
            double EarnedInterest = FV - PV;

            System.out.printf("The Future Values is: $%.2f\n", FV);
            System.out.printf("The Earned Interest is: $%.2f\n", EarnedInterest);

            //  FV = PV (1+R)^n
        }





    }


}