package org.example.bloco2.projeto_1;

public class CustomOrderService extends OrderService{


    public CustomOrderService(Discount discount, Payment payment, Shipping shipping, Tax tax) {
        super(discount, payment, shipping, tax);
    }

    @Override
    protected void validate(double price){
        if(price > 0){
            System.out.println("Price ok " + price);
        }else {
            System.out.println("can't be price minus 0");
        }

    }

    @Override
    protected void log(double total){
        System.out.println("========== Value final  ========");
        System.out.println("========== " +total+ "  =======");
    }

}
