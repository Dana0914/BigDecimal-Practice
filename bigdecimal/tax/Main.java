package bigdecimal.tax;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[0] = new Item(new BigDecimal("75000"), new BigDecimal("12"), new BigDecimal("2"));
        items[1] = new Item(new BigDecimal("150000"), new BigDecimal("12"), new BigDecimal("3"));
        items[2] = new Item(new BigDecimal("225000"), new BigDecimal("12"), new BigDecimal("4"));
        for (Item item : items) {
            System.out.println(item.calculateTax());
        }
    }
}
