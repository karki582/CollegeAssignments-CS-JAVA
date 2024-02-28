import java.util.Scanner;

public class EventDemo {

    public static void main(String[] args) {
        Event event1 = getUserInputEvent();
        Event event2 = getUserInputEvent();
        Event event3 = getUserInputEvent();

        // Display details of each Event object
        System.out.println("Details of Event 1:");
        displayDetails(event1);
        System.out.println("\nDetails of Event 2:");
        displayDetails(event2);
        System.out.println("\nDetails of Event 2:");
        displayDetails(event3);

        // Compare and display the larger event among the pairs
        compareAndDisplayLargerEvent(event1, event2);
        compareAndDisplayLargerEvent(event2, event3);
        compareAndDisplayLargerEvent(event1, event3);
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
        System.out.println("Price: $" + event.getTotalPrice());
    }

    public static void compareAndDisplayLargerEvent(Event event1, Event event2) {
        if (event1.getNumberOfGuests() > event2.getNumberOfGuests()) {
            System.out.println("Event " + event1.getEventNumber() + " has more guests.");
            displayDetails(event1);
        } else {
            System.out.println("Event " + event2.getEventNumber() + " has more guests.");
            displayDetails(event2);
        }
    }


}
