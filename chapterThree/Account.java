package chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public void deposit(double amount) {
        if (balance > 0.0) {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.print("Withdrawal amount exceeded account balance.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }
    
}
