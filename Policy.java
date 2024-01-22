import java.util.Scanner;

public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;

    
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return (weight * 703.0) / (height * height);
    }

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

public class PolicyDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Policy Information:");
        System.out.print("Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine().toLowerCase();

        System.out.print("Height (in inches): ");
        int height = scanner.nextInt();

        System.out.print("Weight (in pounds): ");
        int weight = scanner.nextInt();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.println("\nPolicy Information:");
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("First Name: " + policy.getFirstName());
        System.out.println("Last Name: " + policy.getLastName());
        System.out.println("Age: " + policy.getAge());
        System.out.println("Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Height: " + policy.getHeight() + " inches");
        System.out.println("Weight: " + policy.getWeight() + " pounds");
        System.out.println("BMI: " + policy.calculateBMI());
        System.out.println("Insurance Price: $" + policy.calculateInsurancePrice());

        scanner.close();
    }
}
