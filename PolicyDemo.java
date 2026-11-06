import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) throws IOException {
        // Prepare to read the text file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);
        
        // Create an ArrayList to hold the Policy objects
        ArrayList<Policy> policies = new ArrayList<Policy>();

        // Loop through the file until there is no more data
        while (inputFile.hasNext()) {
            // Read data sequentially matching the file structure
            int policyNum = inputFile.nextInt();
            inputFile.nextLine(); // Clear the newline character from the buffer
            
            String provider = inputFile.nextLine();
            String fName = inputFile.nextLine();
            String lName = inputFile.nextLine();
            
            int age = inputFile.nextInt();
            inputFile.nextLine(); // Clear the newline character from the buffer
            
            String smoker = inputFile.nextLine();
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();

            // Clear the newline after the double, and the blank line separating records
            if (inputFile.hasNext()) {
                inputFile.nextLine(); 
                inputFile.nextLine();
            }

            // Instantiate a new Policy object and add it to the ArrayList
            Policy p = new Policy(policyNum, provider, fName, lName, age, smoker, height, weight);
            policies.add(p);
        }
        
        // Close the file scanner
        inputFile.close();

        // Loop through the ArrayList to print the parsed policies
        for (int i = 0; i < policies.size(); i++) {
            Policy p = policies.get(i);
            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println("First Name: " + p.getFirstName());
            System.out.println("Last Name: " + p.getLastName());
            System.out.println("Age: " + p.getAge());
            System.out.println("Smoking Status: " + p.getSmokingStatus());
            System.out.println("Height: " + p.getHeight() + " inches");
            System.out.println("Weight: " + p.getWeight() + " lbs");
            System.out.println();
        }
    }
}