package org.example.bloco2.ex5;

public class OrderService {
    private Shipping shipping;
    private Tax tax;

    public OrderService(Shipping shipping, Tax tax){
        this.shipping = shipping;
        this.tax = tax;
    }

    public double calculate(double price) {
            double total = price;
            total +=  tax.calculate(price);
            total+= shipping.cost();

        return total;
    }
}
