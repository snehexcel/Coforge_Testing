
package sneha123;

public class Lab6 {
    public static void main(String[] args) {
        // (a) Create object using constructor; pick one approach:

        // Option 1: Use 3-arg constructor, then set age and weight:
        Person obj = new Person("Sneha", "R", 'F');
        obj.setAge(20);
        obj.setWeight(85.55);

        // Option 2: Use full 5-arg constructor directly (uncomment to use)
        // Person obj = new Person("Sneha", "R", 'F', 20, 85.55);

        // (b) Display details in Lab 1.4 format
        obj.displayBasicDetails();
    }
}
