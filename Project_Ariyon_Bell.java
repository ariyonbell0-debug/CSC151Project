import java.util.Scanner;

public class Project_Ariyon_Bell {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        String policyNumber = keyboard.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); // Consume the remaining newline

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = keyboard.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = keyboard.nextDouble();

        // Create the Policy object using the parameterized constructor
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Display Output
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.printf("Policyholder’s Height: %.1f inches\n", policy.getHeight());
        System.out.printf("Policyholder’s Weight: %.1f pounds\n", policy.getWeight());
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
        
        keyboard.close();
    }
}