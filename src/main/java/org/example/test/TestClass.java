package org.example.test;

public class TestClass {

    private static final Integer MINIMUM_PRICE = 1;

    private Integer price;

    public Integer getPrice(){
        return price;
    }

    public TestClass setPrice(Integer price){
        if(price < MINIMUM_PRICE){
            throw new PriceException("The price can'n be less than %s".formatted(MINIMUM_PRICE));
        }
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return price.toString();
    }
}
