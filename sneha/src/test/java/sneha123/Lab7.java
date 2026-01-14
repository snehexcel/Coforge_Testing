
package sneha123;

/**
 * Lab 7: Person class with default and parameterized constructors,
 * a method to accept phone number, and methods to display details.
 */
public class Person {
    // Fields
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private double weight;
    private String phoneNumber;

    // Default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.gender = 'U'; // Unknown
        this.age = 0;
        this.weight = 0.0;
        this.phoneNumber = null;
    }

    // Parameterized constructor (basic)
    public Person(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = 0;
        this.weight = 0.0;
        this.phoneNumber = null;
    }

    // Parameterized constructor (full)
    public Person(String firstName, String lastName, char gender, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.phoneNumber = null;
    }

    // --- Getters ---
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public char getGender()      { return gender; }
    public int getAge()          { return age; }
    public double getWeight()    { return weight; }
    public String getPhoneNumber(){ return phoneNumber; }

    // --- Setters (optional for Lab 7 if using 3-arg constructor) ---
    public void setAge(int age)          { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }

    /**
     * Lab 7 requirement: Accept phone number of a person.
     * Basic validation allowing digits, spaces, +, -, and parentheses.
     */
    public void acceptPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        String trimmed = phoneNumber.trim();
        if (!trimmed.matches("[0-9 +\\-().]{6,20}")) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
        this.phoneNumber = trimmed;
    }

    /**
     * Lab 7 requirement: Define method for displaying person details (including phone).
     */
    public void displayFullDetails() {
        System.out.println("Person Details:");
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.printf("Weight: %.2f%n", weight);
        System.out.println("Phone Number: " + (phoneNumber != null ? phoneNumber : "N/A"));
    }
}
``
