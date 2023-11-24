package targetHeartRateCalculattor;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private static LocalDate dateOfBirth;


    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth and press the enter key: ");
        int year = input.nextInt();

        System.out.print("Enter your month of birth and press the enter key: ");
        int month = input.nextInt();

        System.out.print("Enter your day of birth and press the enter key: ");
        int day = input.nextInt();

        LocalDate  birth = LocalDate.of(year, month, day); 
        
        dateOfBirth = birth;
    
     }
    
    public static int calculateAge() {
        
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        int age = period.getYears();
        return age;

    
    }

    public static int calculateMaxHeartRate() {
        int maxHR = 220 - calculateAge();
        return maxHR;

    }
    public static int calculateTatgetHeartRate1() {
        double tarHR1 =  calculateMaxHeartRate() * 0.5;
        return (int)tarHR1;
    }
    public static int calculateTatgetHeartRate2() {
        double tarHR2 =  calculateMaxHeartRate() * 0.85;
        return (int)tarHR2;
    }
}
