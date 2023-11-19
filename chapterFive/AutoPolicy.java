package chapterFive;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == "C" || state == "T")
            this.state = state;
        else if (state == "M" || state == "A")
            this.state = state;
        else if (state == "M" || state == "E")
            this.state = state;
        else if (state == "N" || state == "H")
            this.state = state;
        else if (state == "N" || state == "J")
            this.state = state;
        else if (state == "N" || state == "Y")
            this.state = state;
        else if (state == "P" || state == "A")
            this.state = state;
        else if (state == "V" || state == "T")
            this.state = state;
        else {
            System.out.print("Error");
        }
    }
    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
        
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }

    
}
