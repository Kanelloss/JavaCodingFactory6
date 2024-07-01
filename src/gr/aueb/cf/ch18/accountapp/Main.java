//package gr.aueb.cf.ch18.accountapp;
//
//// Main.java
//public class Main {
//    public static void main(String[] args) {
//        AccountDAO accountDAO = new AccountDAOImpl();
//        AccountService accountService = new AccountService(accountDAO);
//
//        // Create accounts
//        accountService.createAccount(1, "GR1601101250000000012300695", "John", "Doe", "123-45-6789", 1500.0);
//        accountService.createAccount(2, "GR1601101250000000012300696", "Jane", "Smith", "987-65-4321", 2500.0);
//
//        // List all accounts
//        System.out.println("All accounts: " + accountService.listAccounts());
//
//        // Get a specific account
//        AccountDTO account = accountService.getAccount(1);
//        System.out.println("Account with ID 1: " + account);
//
//        // Update an account
//        accountService.updateAccount(1, "GR1601101250000000012300695", "John", "Doe", "123-45-6789", 2000.0);
//        System.out.println("Updated account with ID 1: " + accountService.getAccount(1));
//
//        // Delete an account
//        accountService.deleteAccount(2);
//        System.out.println("All accounts after deletion: " + accountService.listAccounts());
//    }
//}
//
