package sneha123;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab5 {

    public static void main(String[] args) {
        // Read a number from the user and report if it's positive, negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            double num = sc.nextDouble();
            if (num > 0) {
                System.out.println(num + " is positive.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter a numeric value.");
        } finally {
            sc.close();
        }
    }

}