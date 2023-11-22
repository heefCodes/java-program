package targetHeartRateCalculattor;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1991, 9, 02);
        HeartRates myheartRateInfo = new HeartRates("", "", date);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = input.nextLine();
        myheartRateInfo.setFirstName(first);

        System.out.print("Enter your last name: ");
        String last = input.nextLine();
        myheartRateInfo.setLastName(last);

        
        myheartRateInfo.setDateOfBirth();

        System.out.printf("%nFirst name: %s", myheartRateInfo.getFirstName());
        System.out.printf("%nLast name: %s%n", myheartRateInfo.getLastName());
        
        System.out.printf("You are %d years old.\n", HeartRates.calculateAge());

        System.out.printf("Your maximum hear rate is %d beats per minute%n", HeartRates.calculateMaxHeartRate());
        System.out.printf("Your Target-Heart-rate lies between %d - %d percent %n%n", HeartRates.calculateTatgetHeartRate1(), HeartRates.calculateTatgetHeartRate2());
    }
}
