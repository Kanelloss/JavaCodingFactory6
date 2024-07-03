package gr.aueb.cf.ch19.streams;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 2.25, 100), new Product("Honey", 3.50, 50),
                new Product("Honey", 8.50, 200), new Product("Oranges", 8.50, 20)));

        // Η filter δεν πειράζει την ίδια λίστα, δημιουργεί μια καινούρια)
//        List<Product> honey = products.stream()
//                .filter(product -> product.getDescription().equals("Honey"))
//                .toList();
//
//        honey.forEach(System.out::println);

//        List<Product> sortedHoney = products.stream()
//                .filter(product -> product.getDescription().equals("Honey"))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .toList();
//
//        sortedHoney.forEach(System.out::println);

//        List<Double> productPrices = products.stream()
//                .sorted(Comparator.comparing(Product::getPrice, Comparator.reverseOrder()))
//                .map(Product::getPrice)
//                .toList();
//
//        productPrices.forEach(System.out::println);

//        List<Product> increasedPricesProducts = products.stream()
//                .map(p -> new Product(p.getDescription(), p.getPrice() + p.getPrice() * 0.1, p.getQuantity()))
//                .toList();
//
//        increasedPricesProducts.forEach(System.out::println);

//        int honeyCount = products.stream()
//                .filter(p -> p.getDescription().equals("Honey"))
//                .reduce(0, (total, p) -> total + p.getQuantity(), Integer::sum);
//
//        int honeySum = products.stream()
//                .filter(p -> p.getDescription().equals("Honey"))
//                .mapToInt(Product::getQuantity)
//                .sum();

        Optional<Product> opt = products.stream()
                .filter(p -> p.getPrice() >= 8.50 && p.getQuantity() <= 40)
                .findFirst();

        System.out.println(opt.orElse(null));




    }
}
