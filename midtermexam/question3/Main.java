package question3;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------Customer----------");

        // Getting user input for Customer object creation
        System.out.print("1. Enter User ID : ");
        int userID = scanner.nextInt();
        scanner.nextLine(); // consume newline after integer input

        System.out.print("2. Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("3. Enter Name    : ");
        String name = scanner.nextLine();

        System.out.print("4. Enter Age     : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline after integer input

        System.out.print("5. Enter Email   : ");
        String email_id = scanner.nextLine();

        System.out.print("6. Enter Document Type (.jpg, .png, .pdf): ");
        String document = scanner.nextLine();

        // Creating a Customer object with input parameters
        Customer customer = new Customer(userID, password, name, age, email_id, document);

        // Editing profile details (using same inputs for simplicity)
        customer.edit_profile(userID, password, name, age, email_id, document);

        // Logging in
        System.out.println("Logging in...");
        customer.log_in(userID, password);

        customer.applyVerification(document); // Check verification based on user input

        // Logging out
        System.out.println("Logging out...");
        customer.log_out();

        // Recovering password
        System.out.println("Recovering password...");
        customer.recover_password();

        System.out.println("-----------Admin-------------");

        // Creating Admin object and invoking admin methods
        Admin admin = new Admin();
        admin.add_vehicle();
        admin.update_vehicle_details(11101);
        admin.verify_user(userID);
        admin.retrieve_complains();

        // Close scanner resource
        scanner.close();
    }
}
