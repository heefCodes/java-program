package cryptography;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {

        int digit1, digit2, digit3, digit4;
        int userInput;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Press 1. Encryption and 2. Decryption: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter four-digit number to encrypt: ");
            userInput = input.nextInt();

            digit1 = ((userInput / 1000) + 7) % 10;
            digit2 = ((userInput / 100 % 10) + 7) % 10;
            digit3 = ((userInput / 10 % 10 % 10) + 7) % 10;
            digit4 = ((userInput % 10) + 7) % 10;

            System.out.printf("The encrypted key is: %d%d%d%d", digit1, digit2, digit3, digit4);

        }else 
        if (choice == 2){
            System.out.print("Enter the encrypted key: ");
            userInput = input.nextInt();

            digit1 = ((userInput % 10) - 7) % 10;
            digit2 = ((userInput / 10 % 10 % 10) -7) % 10;
            digit3 = ((userInput /100 % 10) -7) % 10;
            digit4 = ((userInput /1000) - 7) % 10;

            System.out.printf("The Descripted key is: %d%d%d%d", digit1, digit2, digit3, digit4);
        }

        
    }
}

        
    

    