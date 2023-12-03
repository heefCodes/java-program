package chapterEight;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final Date hirDate;


    public Employee(String firstName, String lastName, Date birthDate, Date hirDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hirDate = hirDate;
    }
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
        lastName, firstName, birthDate, hirDate);
    }

    
}
