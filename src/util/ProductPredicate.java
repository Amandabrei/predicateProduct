package util;

import entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {  //linha predicate usando interface

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }

}
