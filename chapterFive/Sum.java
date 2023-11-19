package chapterFive;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;        

        for (int number = 2; number <= 20; number += 2) {
            total += number;
        }
        System.out.printf("Sum is %d%n", total);
    }
}
