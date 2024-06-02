package gr.aueb.cf.ch13.bankapp.model;

public class JointAccount {
    private int id;
    private String iban;
    private String holder1Name;
    private String holder2Name;
    private String ssn1;
    private String ssn2;
    private double balance;

    // Default Constructor
    public JointAccount() {
    }

    // Overloaded Constructor
    public JointAccount(int id, String iban, String holder1Name, String holder2Name, String ssn1, String ssn2, double balance) {
        this.id = id;
        this.iban = iban;
        this.holder1Name = holder1Name;
        this.holder2Name = holder2Name;
        this.ssn1 = ssn1;
        this.ssn2 = ssn2;
        this.balance = balance;
    }
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getHolder1Name() {
        return holder1Name;
    }

    public void setHolder1Name(String holder1Name) {
        this.holder1Name = holder1Name;
    }

    public String getHolder2Name() {
        return holder2Name;
    }

    public void setHolder2Name(String holder2Name) {
        this.holder2Name = holder2Name;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    /**
     * Deposits a certain amount of money in
     * {@link JointAccount}
     * @param amount
     *      the amount of money to be deposited.
     * @throws Exception
     *      if amount is negative.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative Amount Exception");
            }
            balance += amount;
            System.out.println("Deposit of " + amount + " successful");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws Exception {
        if (!isSsnValid(ssn1, ssn) && !isSsnValid(ssn2, ssn)) {
            throw new Exception("Ssn not valid exception");
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdraw of " + amount + " successful. User ssn: " + ssn);
    }

    private boolean isSsnValid(String expectedSsn, String providedSsn) {
        return expectedSsn.equals(providedSsn);
    }


    public double getAccountBalance() {
        System.out.println("Return of account balance successful");
        return getBalance();
    }

    public String accountToString() {
        return "(ID: " + id + ", Iban: " + iban + ", Holder1: " + holder1Name + ", Holder2: " + holder2Name + ", Balance: " + balance + ")";
    }

    public void overdraft(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn1, ssn) && !isSsnValid(ssn2, ssn)) {
                throw new Exception("Ssn not valid exception");
            }

            if (amount > balance) {
                balance -= amount;
                System.out.println("Withdraw of " + amount + " successful. Account overdrafted by: " + (-balance) + " " +  "User ssn: " + ssn);
            } else {
                balance -= amount;
                System.out.println("Simple withdraw of " + amount + " successful. User ssn: " + ssn);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
