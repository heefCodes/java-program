package chapterFive;

public class AutoPolicyTest {
    public static void main(String[] args) {
        
        AutoPolicy policy1 = new AutoPolicy(11111, "Toyota Camry", "ME");
        // AutoPolicy policy2 = new AutoPolicy(22222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        // policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy1) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; %nState %s %s a no-fault state%n%n",
            policy1.getAccountNumber(), policy1.getMakeAndModel(), policy1.getState(),
            (policy1.isNoFaultState() ? "is" : "is not"));

    }
}
