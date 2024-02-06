import java.util.Scanner;

/**
 * The Policy class represents an insurance policy with various attributes.
 */
public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;

    /**
     * Default constructor for Policy class.
     * Initializes all attributes to default values.
     */
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

    /**
     * Parameterized constructor for Policy class.
     *
     * @param policyNumber   The policy number.
     * @param providerName   The name of the insurance provider.
     * @param firstName      The first name of the policy holder.
     * @param lastName       The last name of the policy holder.
     * @param age            The age of the policy holder.
     * @param smokingStatus  The smoking status of the policy holder.
     * @param height         The height of the policy holder.
     * @param weight         The weight of the policy holder.
     */
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

    /**
     * Getter for policyNumber attribute.
     *
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Setter for policyNumber attribute.
     *
     * @param policyNumber The new policy number to set.
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    // Similar documentation comments for other getter and setter methods...

    /**
     * Calculates the Body Mass Index (BMI) based on weight and height.
     *
     * @return The calculated BMI.
     */
    public double calculateBMI() {
        return (weight * 703.0) / (height * height);
    }

    /**
     * Calculates the insurance price based on BMI, age, and smoking status.
     *
     * @return The calculated insurance price.
     */
    public double calculateInsurancePrice() {
        double additionalFee = (calculateBMI() - 35) * 20;
        double baseFee = 600;

        if (age > 50) {
            baseFee += 75;
        }

        if (smokingStatus.equals("smoker")) {
            baseFee += 100;
        }

        return baseFee + additionalFee;
    }
}

/**
 * The PolicyDemo class contains the main method for user input and displaying policy information.
 */
public class PolicyDemo {

    /**
     * The main method takes user input to create a Policy object and displays its information.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // ...
    }
}
