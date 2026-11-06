import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);
        
        ArrayList<Policy> policies = new ArrayList<Policy>();
        int smokers = 0;
        int nonSmokers = 0;

        while (inputFile.hasNext()) {
            int policyNum = inputFile.nextInt();
            inputFile.nextLine(); 
            String provider = inputFile.nextLine();
            String fName = inputFile.nextLine();
            String lName = inputFile.nextLine();
            int age = inputFile.nextInt();
            inputFile.nextLine(); 
            String smokerStatus = inputFile.nextLine();
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();

            if (inputFile.hasNext()) {
                inputFile.nextLine(); 
                inputFile.nextLine();
            }

            // Step 7: Tally smokers and non-smokers
            if (smokerStatus.equalsIgnoreCase("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }

            // Create PolicyHolder, then pass it to the Policy constructor
            PolicyHolder holder = new PolicyHolder(fName, lName, age, smokerStatus, height, weight);
            Policy p = new Policy(policyNum, provider, holder);
            policies.add(p);
        }
        inputFile.close();

        // Step 6: Implicitly call toString
        for (int i = 0; i < policies.size(); i++) {
            System.out.println(policies.get(i)); // Triggers p.toString()
            System.out.println();
        }

        // Step 7: Display outputs
        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }
}