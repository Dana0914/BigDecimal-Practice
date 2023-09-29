package bigdecimal.calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        BigDecimal num1 = scan.nextBigDecimal();
        System.out.println("Enter the operation (+, -, *, /): ");
        String op = scan.next();
        System.out.println("Enter the second number: ");
        BigDecimal num2 = scan.nextBigDecimal();
        Calculator calculator = new Calculator(num1, op, num2);
        calculator.getCalculated();
    }
}
