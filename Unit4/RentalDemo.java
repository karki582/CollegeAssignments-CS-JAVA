import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        // Declare two Rental objects
        Rental rental1 = new Rental(); // Default constructor
        Rental rental2 = getInputRental(); // Constructed from user input

        // Display details of each object
        System.out.println("Details of Rental 1:");
        displayDetails(rental1);
        System.out.println("\nDetails of Rental 2:");
        displayDetails(rental2);
    }

    public static Rental getInputRental() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contract number: ");
        String contractNumber = scanner.nextLine();
        System.out.print("Enter number of minutes: ");
        int minutes = scanner.nextInt();
        return new Rental(contractNumber, minutes);
    }

    // Method to display details of a Rental object
    public static void displayDetails(Rental rental) {
        System.out.println("Contract Number: " + rental.getContractNumber());
        System.out.println("Hours: " + rental.getHours());
        System.out.println("Extra Minutes: " + rental.getExtraMinutes());
        System.out.println("Price: $" + rental.getPrice());
    }
}
