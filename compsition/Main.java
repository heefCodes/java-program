package compsition;

public class Main {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Abdul", "Kareem", "11-111-11111", 230, .04);
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(200, commissionEmployee);

        System.out.print("Employee information");

        System.out.print(employee);
    }
}
