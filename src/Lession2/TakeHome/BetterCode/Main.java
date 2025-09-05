package Lession2.TakeHome.BetterCode;

public class Main {
    public static void main(String[] args) {
        Products iphone = new ElectronicProducts(500.0, "electric", 0.10);

        DiscountCalculator disc = new DiscountCalculator();
        double discount = disc.calculateDiscount(iphone);
        System.out.println("discount is " +discount);
    }
}
