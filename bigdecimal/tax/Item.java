package bigdecimal.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
    private BigDecimal baseItemPrice;
    private BigDecimal vatTax;
    private BigDecimal addTax;

    public Item(BigDecimal baseItemPrice, BigDecimal vatTax, BigDecimal addTax) {
        this.baseItemPrice = baseItemPrice;
        this.vatTax = vatTax;
        this.addTax = addTax;
    }
    public BigDecimal calculateTax() {
        BigDecimal itemPriceWithVatTax = baseItemPrice.multiply(vatTax).divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP);
        BigDecimal itemPriceWithAddTax = baseItemPrice.multiply(addTax).divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP);
        return baseItemPrice.add(itemPriceWithAddTax).add(itemPriceWithVatTax);
    }
}
