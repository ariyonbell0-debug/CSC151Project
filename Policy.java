public class Policy {
    // Private fields to maintain encapsulation
    private int policyNumber;      // Holds the policy number
    private String providerName;   // Holds the insurance provider's name
    private String firstName;      // Holds the policyholder's first name
    private String lastName;       // Holds the policyholder's last name
    private int age;               // Holds the policyholder's age
    private String smokingStatus;  // Holds the policyholder's smoking status
    private double height;         // Holds the policyholder's height in inches
    private double weight;         // Holds the policyholder's weight in pounds

    // Constructor to initialize the Policy object with data
    public Policy(int policyNumber, String providerName, String firstName, String lastName, 
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;     // Assign parameter to instance variable
        this.providerName = providerName;     // Assign parameter to instance variable
        this.firstName = firstName;           // Assign parameter to instance variable
        this.lastName = lastName;             // Assign parameter to instance variable
        this.age = age;                       // Assign parameter to instance variable
        this.smokingStatus = smokingStatus;   // Assign parameter to instance variable
        this.height = height;                 // Assign parameter to instance variable
        this.weight = weight;                 // Assign parameter to instance variable
    }

    // Accessor (Getter) Methods to retrieve private data
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // Mutator (Setter) Methods to update private data
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }
}