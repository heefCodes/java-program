package chapterThree;

import java.math.BigDecimal;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        BigDecimal bal = BigDecimal.valueOf(50.00);

        Account account = new Account("Jane", bal);

        System.out.printf("%s initial balance: $%.2f%n", account.getName(), account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        BigDecimal depositAmount = input.nextBigDecimal();
        account.deposit(depositAmount);
    
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());

        System.out.print("Enter withdraw amount: ");
        BigDecimal withdrawalAmount = input.nextBigDecimal();
        account.withdraw(withdrawalAmount);

        System.out.printf("%n%s balance: $%.2f%n", account.getName(), account.getBalance());
        
    }
}
