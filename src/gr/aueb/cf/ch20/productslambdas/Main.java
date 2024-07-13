package gr.aueb.cf.ch20.productslambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Product> products = List.of(new Product(1, "Laptop", 840.00, 10),
            new Product(2, "Smartphone", 300.00, 150),
            new Product(3, "Tablet", 470.00, 200),
            new Product(4, "Monitor", 150.00, 12),
            new Product(5, "Smartwatch", 70.00, 50)
    );


    public static void main(String[] args) {

        // filter via price
        System.out.println("Expensive Items: ");
        List<Product> expensiveProducts = getFilteredProducts(products, product -> product.getPrice() >= 450);

        // Printing in 2 ways (toString and printInstance)
        expensiveProducts.forEach(System.out::println);

        System.out.println();

        printProducts(expensiveProducts, expensiveProduct -> expensiveProduct.printInstanceProduct());

        System.out.println();


        // filter via quantity (sorted descending with Stream API)
        System.out.println("Limited Stock Items: ");
        List<Product> limitedStockProducts = getFilteredProducts(products, product -> product.getQuantity() < 20)
                .stream()
                .sorted(Comparator.comparing(Product::getQuantity, Comparator.reverseOrder()))
                .toList();

        limitedStockProducts.forEach(System.out::println);

        System.out.println();

        // filter via title (contains "smart" within description)
        System.out.println("Smart Products");
        List<Product> smartProducts = getFilteredProducts(products, product -> product.getTitle().contains("Smart"));

        smartProducts.forEach(System.out::println);
    }

    public static List<Product> getFilteredProducts(List<Product> products, Predicate<Product> filter) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static void printProducts(List<Product> products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }
}
