package main.java.com.upb.agripos;

public class MainExceptionDemo {
    /**
     * @param args
     */
    public static void main(String[] args) throws ProductNotFoundException, InvalidQuantityException {
        System.out.println("Hello, I am [Toufik Nur Hidayat]-[240320567] (Week9-exception)");

        ShoppingCart cart = new ShoppingCart(null, null, 0, 0);
        Product p1 = new Product("P01", "Pupuk Organik", 25000, 3);

        cart.addProduct(p1, -1);

        cart.removeProduct(p1);

        try {
            cart.addProduct(p1, 5);
            cart.checkout();
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}