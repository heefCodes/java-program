package compsition;

public class BasePlusCommissionEmployee {
    private double baseSalary;
    private CommissionEmployee commissionEmployee;

    
    public BasePlusCommissionEmployee(double baseSalary, CommissionEmployee commissionEmployee) {
        this.commissionEmployee = commissionEmployee;

        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    public double earnings(){
        return baseSalary + commissionEmployee.earnings();
    }

    @Override
    public String toString(){
        return String.format(
        "%n%s%s%n%s%s%n%s%s%n%s%.2f%n%s%.2f%n%s%.2f%n", 
        "First name: ",commissionEmployee.getFirstName(),
        "Last name: ",commissionEmployee.getLastName(),
        "Social security number: ",commissionEmployee.getSocialSecurityNumber(),
        "Gross sales: ",commissionEmployee.getGrossSales(),
        "Commission rate: ",commissionEmployee.getCommissionRate(),
        "Base salary earning: ",commissionEmployee.earnings());
    }

    

   
}


