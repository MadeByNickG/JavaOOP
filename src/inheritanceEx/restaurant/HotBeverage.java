package inheritanceEx.restaurant;

import java.math.BigDecimal;

public class HotBeverage extends Beverages{

    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
