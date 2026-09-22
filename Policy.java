public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Default constructor that initializes fields to default values.
     */
    public Policy() {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    /**
     * Constructor with arguments to initialize all policy fields.
     * 
     * @param policyNumber  The policy number
     * @param providerName  The insurance provider name
     * @param firstName     The policyholder's first name
     * @param lastName      The policyholder's last name
     * @param age           The policyholder's age
     * @param smokingStatus The smoking status ("smoker" or "non-smoker")
     * @param height        The height in inches
     * @param weight        The weight in pounds
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName, 
                  int age, String smokingStatus, double height, double weight) {
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
     * Calculates the Body Mass Index (BMI) of the policyholder.
     * 
     * @return The calculated BMI as a double
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates the monthly price of the insurance policy based on age, smoking status, and BMI.
     * 
     * @return The total policy price as a double
     */
    public double calculatePrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        if (age > 50) {
            additionalFee += 75.0;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100.0;
        }
        
        double bmi = calculateBMI();
        if (bmi > 25.0) {
            additionalFee += (bmi - 25.0) * 20.0;
        }

        return baseFee + additionalFee;
    }

    // Getters and Setters with Javadocs

    /**
     * Gets the policy number.
     * @return The policy number
     */
    public String getPolicyNumber() { return policyNumber; }

    /**
     * Gets the provider name.
     * @return The provider name
     */
    public String getProviderName() { return providerName; }

    /**
     * Gets the policyholder's first name.
     * @return The first name
     */
    public String getFirstName() { return firstName; }

    /**
     * Gets the policyholder's last name.
     * @return The last name
     */
    public String getLastName() { return lastName; }

    /**
     * Gets the policyholder's age.
     * @return The age
     */
    public int getAge() { return age; }

    /**
     * Gets the policyholder's smoking status.
     * @return The smoking status
     */
    public String getSmokingStatus() { return smokingStatus; }

    /**
     * Gets the policyholder's height.
     * @return The height in inches
     */
    public double getHeight() { return height; }

    /**
     * Gets the policyholder's weight.
     * @return The weight in pounds
     */
    public double getWeight() { return weight; }
}