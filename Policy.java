public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;

    // No-arg constructor with default values
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }

    // Constructor with arguments to fully initialize the Policy object
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, int height, int weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters for each attribute
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    // Other getters and setters for the remaining attributes...

    // Method to calculate and return the BMI of the policyholder
    public double calculateBMI() {
        return (weight * 703.0) / (height * height);
    }

    // Method to calculate and return the price of the insurance policy
    public double calculateInsurancePrice() {
        double additionalFee = (calculateBMI() - 35) * 20;
        double baseFee = 600;

        // Additional fees based on age, smoking status, and BMI
        if (age > 50) {
            baseFee += 75;
        }

        if (smokingStatus.equals("smoker")) {
            baseFee += 100;
        }

        return baseFee + additionalFee;
    }
}
