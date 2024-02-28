import java.util.Scanner;

public class EventDemo {

    public static void main(String[] args) {
        Event event1 = new Event();
        Event event2 = getUserInputEvent();

        // Display details of each Event object
        System.out.println("Details of Event 1:");
        displayDetails(event1);
        System.out.println("\nDetails of Event 2:");
        displayDetails(event2);

    }

    // Method that take the input from user and creates Event Object
    public static Event getUserInputEvent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event number: ");
        String eventNumber = scanner.nextLine();
        System.out.print("Enter number of guests: ");
        int numberOfGuests = scanner.nextInt();
        return new Event(eventNumber, numberOfGuests);

    }

    // Method to display details of an Event object
    public static void displayDetails(Event event) {
        System.out.println("Event Number: " + event.getEventNumber());
        System.out.println("Number of Guests: " + event.getNumberOfGuests());
        System.out.println("Price: $" + event.getPrice());
    }


}
