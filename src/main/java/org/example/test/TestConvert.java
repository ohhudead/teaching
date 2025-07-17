package org.example.test;

import org.example.dto.Currency;
import org.example.lessons.week01.Lesson02_Variables;

import java.math.BigDecimal;

public class TestConvert {
    public static void main(String[] args) {
        System.out.printf(" is it equal? - %s %n", new BigDecimal ("2344.00").equals(new BigDecimal ("2344.00")));
        Lesson02_Variables.convertTo(new BigDecimal("75.34"), Currency.RUB, Currency.USD);
        Lesson02_Variables.convertTo(new BigDecimal("86.78"), Currency.USD, Currency.RUB);
        Lesson02_Variables.convertTo(new BigDecimal("200"), Currency.EUR, Currency.RUB);
    }
}