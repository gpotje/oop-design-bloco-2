package org.example.bloco2.ex9;

public class PriceService {
    private Discount discount;
    private Fee fee;

    public PriceService(Discount discount,Fee fee){
        this.discount = discount;
        this.fee = fee;
    }

    public double calculate(double price) {
        return price - discount.discount(price) + fee.fee(price);
    }
}
