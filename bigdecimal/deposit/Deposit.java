package bigdecimal.deposit;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Deposit {
    private BigDecimal amount;
    private BigDecimal monthlyInterestRate;
    private int month;

    public Deposit(BigDecimal amount, BigDecimal monthlyInterestRate, int month) {
        this.amount = amount;
        this.monthlyInterestRate = monthlyInterestRate;
        this.month = month;
    }
    public BigDecimal calculateInterestRate() {
        for (int i = 0; i < month; i++) {
            BigDecimal amountOfSumForPeriod = amount.multiply(monthlyInterestRate).divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP);
            amount = amountOfSumForPeriod.divide(new BigDecimal(month), 10, RoundingMode.HALF_UP).add(amount);
        }
        return amount;
    }
}
