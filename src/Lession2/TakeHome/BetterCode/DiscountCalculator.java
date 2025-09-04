package Lession2.TakeHome.BetterCode;


import java.util.List;

public class DiscountCalculator {
// its job is to just calculate the discount and return

public double calculateDiscount(List<Product> product) {
    if (product.getType() == ProductType.ELECTRONICS) {
        return product.getPrice() * 0.10; // 10% discount
    } else if (product.getType() == ProductType.CLOTHING) {
        return product.getPrice() * 0.20; // 20% discount
    }
    return 0;
}

}
