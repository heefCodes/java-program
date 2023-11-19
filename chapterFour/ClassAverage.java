package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int total = 0;
         int gradeCounter = 1;

         while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            if (grade >= 0 && grade <= 100) {
                total = total + grade;
                gradeCounter = gradeCounter + 1;

            }
            else {
                System.out.print("Enter a value between 0 to 100.\n");
            }
            
         }

         int average = total / 10;

         System.out.printf("%nTotal of all 10 grades is %d%n", total);
         System.out.printf("Class average is %d%n", average);
    }
}
