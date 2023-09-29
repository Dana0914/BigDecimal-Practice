package bigdecimal.deposit;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        BigDecimal value = scan.nextBigDecimal();
        System.out.println("Enter the monthy interest rate: ");
        BigDecimal interestRate = scan.nextBigDecimal();
        System.out.println("Enter the period in months: ");
        int period = scan.nextInt();

        System.out.println(new Deposit(value, interestRate, period).calculateInterestRate());

    }
}
