package heath_record;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1991, 9, 2);
        HealthProfile healthProfile = new HealthProfile("", "", "", date, 0.0, 0.0);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = input.nextLine();
        healthProfile.setFirstName(first);
        
        System.out.print("Enter your last name: ");
        String last = input.nextLine();
        healthProfile.setLastName(last);

        healthProfile.setGender();
        healthProfile.setDateOfBirth();
        healthProfile.setWeight();
        healthProfile.setHeight();


        System.out.printf("%nFirst name: %s", healthProfile.getFirstName());
        System.out.printf("%nLast name: %s%n", healthProfile.getLastName());

        System.out.printf("%nGender: %s%n", healthProfile.getGender());
        
        System.out.printf("You are %d years old.%n", HealthProfile.userAge());

        System.out.printf("Your weight: %s%n", healthProfile.getWeight());
        System.out.printf("Your height: %s%n", healthProfile.getHeight());

        System.out.printf("Your maximum hear rate is %d beats per minute%n", HealthProfile.userMaxHeartRate());
        System.out.printf("Your Target-Heart-rate lies between %d - %d percent %n", HealthProfile.userTargetHeartRate1(), HealthProfile.userTargetHeartRate2());
        System.out.printf("Your BMI is: %d%n", HealthProfile.bodyMassIndex());


    }
}
