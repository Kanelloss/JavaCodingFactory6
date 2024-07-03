package gr.aueb.cf.ch19.sets;

import java.util.HashSet;
import java.util.Set;

public class setDemo {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        // add, remove contains time complexity -> O(1) due to Hash
        bag.add("Honey");   // Honey

        if (bag.contains("Milk")) {
            System.out.println("Milk is already added.");
        } else {
            if (bag.add("Milk")) System.out.println("Success insert");      // Honey, Milk
        }

        if (bag.contains("Honey")) {
            System.out.println("Honey is already added.");
        } else {
            if (bag.add("Honey")) System.out.println("Success insert");
        }

        System.out.println(bag);    // Honey, Milk


        if (bag.remove("Milk")) {
            System.out.println("Successfully removed");
        } else {
            System.out.println("Error in removal.");
        }

        System.out.println(bag);    // Honey



    }
}
