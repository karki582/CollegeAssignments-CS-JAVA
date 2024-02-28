import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        // Declare two Rental objects
        Rental rental1 = getInputRental("Enter details for Rental 1:");
        Rental rental2 = getInputRental("Enter details for Rental 2:");
        Rental rental3 = getInputRental("Enter details for Rental 3:");

        // Display details of each object
        System.out.println("Details of Rental 1:");
        displayDetails(rental1);
        System.out.println("\nDetails of Rental 2:");
        displayDetails(rental2);

        // Compare and display the rental with longer duration among the pairs
        compareAndDisplayLongerRental(rental1, rental2);
        compareAndDisplayLongerRental(rental2, rental3);
        compareAndDisplayLongerRental(rental1, rental3);
    }

    public static Rental getInputRental(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
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
        System.out.println("Extra Minutes: " + rental.getMinutes());
        System.out.println("Price: $" + rental.getPrice());
    }

    public static void compareAndDisplayLongerRental(Rental rental1, Rental rental2) {
        if (rental1.getHours() * 60 + rental1.getMinutes() > rental2.getHours() * 60 + rental2.getMinutes()) {
            System.out.println("Rental " + rental1.getContractNumber() + " has a longer duration.");
            displayDetails(rental1);
        } else {
            System.out.println("Rental " + rental2.getContractNumber() + " has a longer duration.");
            displayDetails(rental2);
        }
    }
}
