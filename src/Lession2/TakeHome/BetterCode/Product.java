package Lession2.TakeHome.BetterCode;


import Lession2.TakeHome.ProductType;

public interface Product {
    ProductType type;
    double price = 0;
     double getPrice() ;

    ProductType getType() {
        return type;
    }

}
