package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("Jane", 50.00);

        System.out.printf("%s initial balance: $%.2f%n", account.getName(), account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
    
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());

        System.out.print("Enter withdraw amount: ");
        double withdrawalAmount = input.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.printf("%n%s balance: $%.2f%n", account.getName(), account.getBalance());
        
    }
}
