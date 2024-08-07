package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.*;
import java.util.stream.Collectors;

public class MapsDemo {

    public static void main(String[] args) {

        Map<String, Product> products = new HashMap<>() {{
            put("HON", new Product("Oranges", 13.50, 50));
            put("MIL", new Product("Milk", 2.50, 100));
            put("ORA", new Product("Oranges", 11.50, 80));
            put("EGG", new Product("Eggs", 3.50, 50));
        }};


        Map<String, Object> criteria = new HashMap<>() {{

                put("price", 10.70);
                put("quantity", 10);
                put("description", "Oranges");

        }};

        List<Product> prods = products.values()
                .stream()
                .filter(p -> p.getPrice() >= 2.50)
                .toList();

        String oranges = products.values().stream()
                        .filter(p -> p.getDescription().equals(criteria.get("description")) && p.getPrice() > (double) criteria.get("price"))
                                .map(Product::toString)
                                        .collect(Collectors.joining(", "));

        prods.forEach(System.out::println);

        System.out.println();

        System.out.println(oranges);




    }
}
