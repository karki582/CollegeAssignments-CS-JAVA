public class Event {
    public final static int PRICE_PER_GUEST = 35;
    public final static int LARGE_EVENT_CUTOFF = 50;

    private String eventNumber;
    private int numberOfGuests;
    private int price;

    public Event(String eventNumber, int numberOfGuests) {
        setEventNumber(eventNumber);
        setGuests(numberOfGuests);
    }

    public Event(){
        this("A000", 0);
    }

    // setter for event number
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    // Setter for number of guests
    public void setGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        calculatePrice(); // automatically calculate price when setting guests
    }

    private void calculatePrice() {
        this.price = numberOfGuests * PRICE_PER_GUEST;

    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getPrice() {
        return price;
    }
}
