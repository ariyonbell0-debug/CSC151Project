public class Policy {
    private int policyNumber;
    private String providerName;
    
    // Step 4: Class collaboration (Aggregation) - Policy has a PolicyHolder
    private PolicyHolder holder; 
    
    // Step 3: Static field to keep track of the number of Policy objects created
    private static int policyCount = 0; 

    // Constructor
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        // Step 5: Create a deep copy to minimize security holes
        this.holder = new PolicyHolder(holder); 
        policyCount++; // Increment static field
    }

    // Accessors and Mutators
    public int getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }
    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    
    // Step 5: Return a copy of the PolicyHolder to prevent security holes
    public PolicyHolder getPolicyHolder() { return new PolicyHolder(holder); }
    public void setPolicyHolder(PolicyHolder holder) { this.holder = new PolicyHolder(holder); }

    // Static method to return the count
    public static int getPolicyCount() {
        return policyCount;
    }

    // Calculates the price of the policy
    public double getPrice() {
        double price = 600.0;
        if (holder.getAge() > 50) price += 75.0;
        if (holder.getSmokingStatus().equalsIgnoreCase("smoker")) price += 100.0;
        if (holder.getBMI() > 35) {
            price += (holder.getBMI() - 35) * 20.0;
        }
        return price;
    }

    // Step 2 & 6: toString implicitly calls the PolicyHolder's toString
    public String toString() {
        return String.format("Policy Number: %d\n" +
                             "Provider Name: %s\n" +
                             "%s\n" + // This calls holder.toString()
                             "Policy Price: $%.2f", 
                             policyNumber, providerName, holder.toString(), getPrice());
    }
}