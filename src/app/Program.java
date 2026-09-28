package app;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Hd Case", 80.90));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        //list.removeIf(new ProductPredicate());  //linha predicate usando interface

        //list.removeIf(Product :: staticProductPredicate);//essa forma usa reference method versao static

        //list.removeIf(Product :: nonstaticProductPredicate);//essa forma usa reference method versao nao static

        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;//usa lambda declarada
        //list.removeIf(pred); //usa lambda declarada

        double min = 100.0; //usa lambda inline
        list.removeIf(p -> p.getPrice() >= min); //usa lambda inline

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
