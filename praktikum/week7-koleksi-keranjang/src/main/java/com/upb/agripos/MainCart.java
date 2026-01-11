package com.upb.agripos;

public class MainCart {
    public static void main(String[] args) {
        System.out.println("Hello, I am Toufik Nur Hidayat-240320567 (Week7-collections)");

        Product p1 = new Product("P01", "Padi", 60000);
        Product p2 = new Product("P02", "Pupuk", 50000);
       
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.printCart();
        cart.removeProduct(p1);
        cart.printCart();
    }
}