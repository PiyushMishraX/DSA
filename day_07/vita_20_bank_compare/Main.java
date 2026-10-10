package day_07.vita_20_bank_compare;

import java.util.Scanner;

// EMI = (loanAmount * monthlyInterestRate) / (1 - (1 / ((1 + monthlyInterestRate) ^ (period * 12))))

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double loanAmount = sc.nextInt();

        double numberOfYears = sc.nextInt();

        int n1 = sc.nextInt();
        double paidToA = 0 ;

        for(int i = 0; i< n1; i ++){

            double interest = sc.nextInt();
            double monthlyInterestRate = interest / 12 / 100;

            double period = sc.nextInt();

            // double emi =  loanAmount * monthlyInterestRate /  (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)); // period * 12 need to be used
            double emi =  loanAmount * monthlyInterestRate /  (1 - 1 / Math.pow(1 + monthlyInterestRate, period * 12));

            paidToA += period * 12 * emi;

        }

        int n2 = sc.nextInt();
        double paidToB = 0 ;

        for(int i = 0; i< n2; i ++){

            double interest = sc.nextInt();
            double monthlyInterestRate = interest / 12 / 100;

            double period = sc.nextInt();

            // double emi =  loanAmount * monthlyInterestRate /  (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double emi =  loanAmount * monthlyInterestRate /  (1 - 1 / Math.pow(1 + monthlyInterestRate, period * 12));

            paidToB += period * 12 * emi;

        }


        double interestA = paidToA - loanAmount;
        double interestB = paidToB - loanAmount;


        if( interestA < interestB){
            System.out.println("Bank B");
        } else {
            System.out.println("Bank A");
        }

        sc.close();
    }
}


// can use it to validate that the slab durations add up to the total loan duration.
// For example, if numberOfYears = 9:
// - Bank A: 3 + 2 + 4 = 9 years
// - Bank B: 3 + 2 + 3 + 1 = 9 years