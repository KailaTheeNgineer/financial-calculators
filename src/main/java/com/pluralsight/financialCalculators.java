package com.pluralsight;


import java.util.Scanner;

public class financialCalculators {

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

        System.out.println("The monthly payment is: $" + monthlyPayment);
        System.out.println("The Interest Is: " + totalInterest);
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

            System.out.println("The Future Value is: $" + FV);
            System.out.println("The Earned Interest is: " + EarnedInterest);

            //  FV = PV (1+R)^n
        }





    }


}




// 495.09 * 12 (months) = 5940 (in 1 year)
// 5940 * 15 (years) = 89100 (with interest)
// 89100 - 53000 (starting loan) = 36100 (interest owed) 53000 left
// .07625 * 15 = 1.14375
// 89100 / 15 = 5940