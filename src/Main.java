import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("iPhone 14 Pro", 5299.00));
        products.add(new Product("AirPods Pro", 1099.00));
        products.add(new Product("AirPods Max", 2499.00));
        products.add(new Product("MacBook Air", 4399.00));
        products.add(new Product("Magic Keyboard", 549.00));

        for (Product product:products) {
            System.out.println(product.getName() + " "+ product.getPrice());
        }

        Collections.sort(products);
        System.out.println("\nAfter executing sort()");
        for (Product product:products) {
            System.out.println(product.getName() + " "+ product.getPrice());
        }
    }
}