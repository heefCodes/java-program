package cryptography;

import java.util.Scanner;

public class Encryption {
    private static int userInput;

    Scanner input = new Scanner(System.in);


    public static int encrypt() {
        System.out.print("Enter four-digit integers separated by spaces:");
        userInput = input.nextInt();
        
    }
}
