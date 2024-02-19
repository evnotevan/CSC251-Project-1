public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;
    private Policy policy;

    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
        this.policy = new Policy(); // Assuming a default policy for now
    }

    // Getters and setters for the PolicyHolder attributes

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

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    // Methods for calculating insurance-related metrics

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

    // Other methods related to PolicyHolder can be added here
}
