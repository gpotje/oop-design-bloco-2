package org.example.bloco2.ex15;



abstract class CheckoutService {
    private Discount discount;
    private Tax tax;


    public CheckoutService(Discount discount, Tax tax){
        this.discount = discount;
        this.tax = tax;
    }

    public void calculate(double price) {
        System.out.println("======== Start ===========");
        applyDiscount(price);
        applyTax(price);
        System.out.println("======== End   ===========");
    }

    protected void applyDiscount(double price){
        System.out.println("Discount: " + discount.discount(price));
    }

    protected void applyTax(double price){
        System.out.println("Tax: " + tax.tax(price));
    }
}
