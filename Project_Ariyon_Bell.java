import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Ariyon_Bell {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            File file = new File("PolicyInformation.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String policyNumber = scanner.nextLine().trim();
                String providerName = scanner.nextLine().trim();
                String firstName = scanner.nextLine().trim();
                String lastName = scanner.nextLine().trim();
                int age = Integer.parseInt(scanner.nextLine().trim());
                String smokingStatus = scanner.nextLine().trim();
                double height = Double.parseDouble(scanner.nextLine().trim());
                double weight = Double.parseDouble(scanner.nextLine().trim());

                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }

                if (scanner.hasNext()) {
                    scanner.nextLine(); 
                }
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        for (Policy p : policies) {
            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println("Policyholder's First Name: " + p.getFirstName());
            System.out.println("Policyholder's Last Name: " + p.getLastName());
            System.out.println("Policyholder's Age: " + p.getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches\n", p.getHeight());
            System.out.printf("Policyholder's Weight: %.1f pounds\n", p.getWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", p.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n\n", p.calculatePrice());
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}