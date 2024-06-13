package gr.aueb.cf.ch16.marker;

import gr.aueb.cf.ch16.Cat;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        CompactDisk cd = new CompactDisk();
        Cat cat = new Cat();

        deliver(book);
        deliver(cd);
        // deliver(cat);   // compile time error
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered");
        } else if ( item instanceof CompactDisk) {
            System.out.println("Cd delivered");
        } else {
            throw new RuntimeException("Can not get delivered.");
        }
    }
}
