package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.Account;

public class MainAccount {

    public static void main(String[] args) {

        Account alice = new Account(1, "GR123", "Alice", "W." , "12345", 100D);

        try {
            alice.deposit(1000);
            alice.withdraw(500, "12345");

            System.out.println(alice.getAccountBalance());

            System.out.println("Alice Account State");
            System.out.println(alice.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
