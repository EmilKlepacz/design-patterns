package com.example.strategy;

import java.math.BigDecimal;


public class ThreeLevelTax implements Strategy {
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        if (price.compareTo(new BigDecimal("100")) < 0) {
            return price.multiply(new BigDecimal("0.1"));

        } else if (price.compareTo(new BigDecimal("1000")) < 0 && price.compareTo(new BigDecimal("100")) >= 0){
            return price.multiply(new BigDecimal("0.2"));
        }
        return price.multiply(new BigDecimal("0.3"));
    }
}
