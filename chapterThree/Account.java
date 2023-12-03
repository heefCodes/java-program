package chapterThree;

import java.math.BigDecimal;

public class Account {
    private  String name = "";
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;

        if (balance.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = balance;
        }
    }
    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(depositAmount);
        }
    }
    public void withdraw(BigDecimal withdrawAmount) {
        if (withdrawAmount.compareTo(BigDecimal.ZERO) > 0 && withdrawAmount.compareTo(BigDecimal.ZERO) < balance.compareTo(BigDecimal.ZERO)) {
            balance = balance.subtract(withdrawAmount);
        }
        else {
            System.out.print("Withdrawal amount exceeded account balance.");
        }
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }
    
}
