package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 2.25, 100), new Product("Apples", 8.50, 50),
                new Product("Apples", 4.50, 20), new Product("Apples", 8.50, 20)));

//        System.out.println("Ascending Sorting");
//        Collections.sort(products);     // Comparable was used
//        products.forEach(System.out::println);
//
//        System.out.println("Descending Sorting");
//        Collections.reverse(products);
//        products.forEach(System.out::println);



//        System.out.println("Natural Order");
////        Collections.sort(products, Comparator.naturalOrder());
//        products.sort(Comparator.naturalOrder());
//        products.forEach(System.out::println);
//
//        System.out.println();
//
//        System.out.println("Reverse Order");
//        products.sort(Comparator.reverseOrder());
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription));       // Works without Comparable
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity));
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription)
//                .thenComparingDouble(Product::getPrice)
//                .thenComparingInt(Product::getQuantity));  // Check this one out. Important.
//
//        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                .thenComparing(Product::getQuantity, Comparator.reverseOrder()));

        products.forEach(System.out::println);

    }
}
