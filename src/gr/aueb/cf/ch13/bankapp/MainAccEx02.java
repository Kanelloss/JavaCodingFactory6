package gr.aueb.cf.ch13.bankapp;

import gr.aueb.cf.ch13.bankapp.model.Account;
import gr.aueb.cf.ch13.bankapp.model.JointAccount;

public class MainAccEx02 {

    public static void main(String[] args) {
        Account george = new Account(2, "GR1234567", "George", "Michael", "1234567890", 765D);
        try {
            george.deposit(1000);
            george.overdraft(2100, "1234567890");
            System.out.println("George's Account State" + george.accountToString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // For distinction of accounts used.
        System.out.println();
        System.out.println();

        JointAccount joint = new JointAccount(1, "GR2121212", "John Evans", "Ben Johnson", "1111111111", "2222222222", 6000D);

        try {
            joint.deposit(400);
            joint.overdraft(10000, "2222222222");
            joint.deposit(8000);
            joint.withdraw(1000, "1111111111");
            joint.withdraw(1000, "2222222222");
            System.out.println("Joint Account State: " + joint.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
