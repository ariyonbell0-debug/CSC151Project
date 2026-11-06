public class PolicyHolder {
    // Private fields directly associated with the person
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Standard Constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Step 5: Copy Constructor to minimize security holes
    public PolicyHolder(PolicyHolder object2) {
        this.firstName = object2.firstName;
        this.lastName = object2.lastName;
        this.age = object2.age;
        this.smokingStatus = object2.smokingStatus;
        this.height = object2.height;
        this.weight = object2.weight;
    }

    // Accessor and Mutator methods
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    // Calculates and returns the BMI
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    // Step 2: toString method to format output
    public String toString() {
        return String.format("Policyholder's First Name: %s\n" +
                             "Policyholder's Last Name: %s\n" +
                             "Policyholder's Age: %d\n" +
                             "Policyholder's Smoking Status (Y/N): %s\n" +
                             "Policyholder's Height: %.1f inches\n" +
                             "Policyholder's Weight: %.1f pounds\n" +
                             "Policyholder's BMI: %.2f", 
                             firstName, lastName, age, smokingStatus, height, weight, getBMI());
    }
}