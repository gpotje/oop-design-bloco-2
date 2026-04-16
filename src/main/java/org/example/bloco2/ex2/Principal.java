package org.example.bloco2.ex2;

public class Principal {
    public static void main(String[] args) {
        Bonus dev = new Dev();
        Bonus manager = new Manager();

        BonusService service = new BonusService();
        System.out.println(service.calculate(dev,1000.0));
        System.out.println(service.calculate(manager,1000.0));
    }
}
