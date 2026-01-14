
package sneha123;

/**
 * Person class using Gender enum to restrict gender to only M or F.
 */
public class Person {
    // Fields
    private String firstName;
    private String lastName;
    private Gender gender;  // <-- enum instead of char
    private int age;
    private double weight;
    private String phoneNumber;

    // Default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.gender = null;   // unknown until set
        this.age = 0;
        this.weight = 0.0;
        this.phoneNumber = null;
    }

    // Parameterized constructor (basic)
    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender; // must be Gender.M or Gender.F
        this.age = 0;
        this.weight = 0.0;
        this.phoneNumber = null;
    }

    // Parameterized constructor (full)
    public Person(String firstName, String lastName, Gender gender, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.phoneNumber = null;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public Gender getGender()    { return gender; }
    public int getAge()          { return age; }
    public double getWeight()    { return weight; }
    public String getPhoneNumber(){ return phoneNumber; }

    // Setters (limited to valid enum values)
    public void setGender(Gender gender) { this.gender = gender; }
    public void setAge(int age)          { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Display method (Lab 1.4 / Lab 7 style)
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + (gender != null ? gender : "N/A"));
        System.out.println("Age: " + age);
        System.out.printf("Weight: %.2f%n", weight);
        if (phoneNumber != null) {
            System.out.println("Phone Number: " + phoneNumber);
        }
    }
}
