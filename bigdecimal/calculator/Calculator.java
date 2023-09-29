package bigdecimal.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private String op;
    private BigDecimal num1;
    private BigDecimal num2;

    public Calculator(BigDecimal num1, String op, BigDecimal num2) {
        this.num1 = num1;
        this.op = op;
        this.num2 = num2;
    }
    public void getCalculated() {
        switch (op) {
            case "+" -> System.out.println(num1.add(num2));
            case "-" -> System.out.println(num1.subtract(num2));
            case "*" -> System.out.println(num1.multiply(num2));
            case "/" -> System.out.println(num1.divide(num2, 10, RoundingMode.HALF_UP));
            default -> System.out.printf("Error: %s operation does not exist", op);
        }
    }
}
