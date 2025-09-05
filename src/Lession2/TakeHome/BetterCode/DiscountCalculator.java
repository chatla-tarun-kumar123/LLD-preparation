package Lession2.TakeHome.BetterCode;

public class DiscountCalculator {
    double calculateDiscount(Products product){
        return product.getPrice()*product.discountPercentage;
    }
}
