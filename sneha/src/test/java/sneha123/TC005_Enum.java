
package sneha123;

import java.util.Scanner;

/**
 * Lab 8: Accept only 'M' or 'F' as gender using Enumeration.
 */
public class TC005_Enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read basic details 
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        // Loop until user provides valid gender ('M' or 'F')
        Gender gender = null;
        while (gender == null) {
            System.out.print("Enter Gender (M/F): ");
            String g = sc.nextLine();
            try {
                gender = Gender.fromInput(g); // converts input to enum, validates
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

        // Optional: read age and weight
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Weight: ");
        double weight = Double.parseDouble(sc.nextLine());

        // Create Person using the enum
        Person p = new Person(firstName, lastName, gender, age, weight);

        // Display details
        System.out.println();
        p.displayDetails();

        sc.close();
    }
}
