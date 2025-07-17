package org.example.dto;

import java.math.BigDecimal;

public enum Currency {
    RUB(82.0, 0.0125),
    USD(1.0,1.0),
    EUR(0.9, 0.0111);

    public BigDecimal rateToDollar;
//    public double rateFrom;
    Currency(double rateTo, double rateFrom){
        this.rateToDollar = BigDecimal.valueOf(rateTo);
//        this.rateFrom = rateFrom;
    }
}
