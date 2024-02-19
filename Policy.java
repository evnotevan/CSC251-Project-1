public class Policy {
    private String policyNumber;
    private String providerName;
    private double coverageAmount;
    private double premiumAmount;

    public Policy(String policyNumber, String providerName, double coverageAmount, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.coverageAmount = coverageAmount;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
@Override
public String toString() {
    return "Policy{" +
            "policyNumber='" + policyNumber + '\'' +
            ", providerName='" + providerName + '\'' +
            ", coverageAmount=" + coverageAmount +
            ", premiumAmount=" + premiumAmount +
            '}';
}
public static int getPolicyCount() {
        return policyCount;
    }

}
