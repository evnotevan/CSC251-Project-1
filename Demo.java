import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Policy> policies = readPoliciesFromFile("PolicyInformation.txt");
         int smokers = 0;
         int nonSmokers = 0;

         for (Policy policy : policies) {
         if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
               smokers++;}
               else if (policy.getSmokingStatus().equalsIgnoreCase("non-smoker")) {
               nonSmokers++;
    }
}

         System.out.println("Number of Policyholders who are smokers: " + smokers);
         System.out.println("Number of Policyholders who are non-smokers: " + nonSmokers);

        
                 
       for (Policy policy : policies) {
    System.out.println(policy); // Implicitly calls toString() method
}    }

    private static List<Policy> readPoliciesFromFile(String filename) {
        List<Policy> policies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String policyNumber = line.trim();
                String providerName = reader.readLine().trim();
                String firstName = reader.readLine().trim();
                String lastName = reader.readLine().trim();
                int age = Integer.parseInt(reader.readLine().trim());
                String smokingStatus = reader.readLine().trim();
                int height = Integer.parseInt(reader.readLine().trim());
                int weight = Integer.parseInt(reader.readLine().trim());

                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                // Skip the empty line between policies
                reader.readLine();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return policies;
    }
}