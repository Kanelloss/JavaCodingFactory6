package gr.aueb.cf.ch19.linear;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        // Add
        cities.add("Athens");
        cities.add("Paris");
        cities.add("Kalavrita-city");
        cities.add(2, "London");    // τα υπόλοιπα 1 θέση δεξιά

        // Get
        String myCity = cities.get(0);
        System.out.println(myCity);   // Athens

        // Update - replace
        cities.set(0, "Αθήνα");

        // Remove - Delete
        cities.removeIf(c -> c.length() > 10);
        cities.removeIf(c -> c.equals("Paris"));

        // Traverse
        Iterator<String> itr = cities.iterator();       // itr points at the first position of the collection
        while (itr.hasNext()) {
            String city = itr.next();
            System.out.println(city);
        }

        cities.forEach(System.out::println);

        // Safe διαγραφή μέσω  iterator.remove()
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("Αθήνα")) {
                it.remove();
                // cities.remove(s);    ConcurrentModificationException it fails fast
            }
        }

    }
}
