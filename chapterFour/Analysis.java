package chapterFour;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pass = 0;
        int fail = 0;
        int studentCount = 1;

        while (studentCount <= 10) {
            System.out.print("Enter student result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1){
                pass++;

            }
            else {
                fail++;
            }
            studentCount++;
            
        }
        System.out.printf("Number of student that pass are: %d%n", pass);
        System.out.printf("Number of student that fail are: %d%n", fail);

        if (pass > 8){
            System.out.println("Bonus to instructor!");
        }


    }
}
