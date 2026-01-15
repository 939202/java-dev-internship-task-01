/*
 * HelloJava.java
 *
 * This program is created for Task 1 of the Java Developer Internship.
 * It demonstrates:
 * 1. Basic Java program structure
 * 2. Use of main() method
 * 3. Printing output to console
 * 4. Receiving command-line arguments
 */
public class Task1 {
    // This is the main method.
    // Java execution always starts from main()
    public static void main(String[] args) {

        // Print a welcome message
        System.out.println("Hello! This is my first Java program.");

        // Check if command-line arguments are provided
        if (args.length > 0) {
            System.out.println("Command-line arguments received:");

            // Loop through all arguments and print them
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }

        } else {
            System.out.println("No command-line arguments were provided.");
        }

        System.out.println("Program executed successfully.");
    }
}
