package heath_record;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private static  LocalDate dateOfBirth;
    private static double height;
    private static double weight;

    Scanner input = new Scanner(System.in);

    public HealthProfile(String firstName, String lastName, String gender, LocalDate dateOfBirth, double height,
            double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
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


    public String getGender() {
        return gender;
    }


    public void setGender() {
        System.out.print("Enter your gender: ");
        String gender = input.nextLine();
        this.gender = gender;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth() {

        System.out.print("Enter your year of birth and press the enter key: ");
        int year = input.nextInt();

        System.out.print("Enter your month of birth and press the enter key: ");
        int month = input.nextInt();

        System.out.print("Enter your day of birth and press the enter key: ");
        int day = input.nextInt();

        LocalDate birth = LocalDate.of(year, month, day);

        dateOfBirth = birth;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight() {
        System.out.print("Enter your height in meter and press the enter key: ");
        double height = input.nextDouble();
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight() {
        System.out.print("Enter your weight in kilogram and press the enter key: ");
        double weight = input.nextDouble();
        this.weight = weight;
    }
    public static int userAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        int age = period.getYears();

        return age;
    }
    public static int userMaxHeartRate(){
        int maxHR = 220 - userAge();
        return maxHR;
    }
    public static int userTargetHeartRate1(){
        double tarHR1 = userMaxHeartRate() * 0.5;
        return (int) tarHR1;
    }
    public static int userTargetHeartRate2(){
        double tarHR2 = userMaxHeartRate() * 0.58;
        return (int) tarHR2;
    }
    public static int bodyMassIndex(){
        double bmi = weight / height * height;
        return (int)bmi;
    }
    

    
}
