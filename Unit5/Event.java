public class Event {
    public final static int LOWER_PRICE_PER_GUEST = 32;
    public final static int HIGHER_PRICE_PER_GUEST = 35;
    public final static int LARGE_EVENT_THRESHOLD = 50;

    private String eventNumber;
    private int numberOfGuests;
    private int totalPrice;
    private int pricePerGuest;

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

    private void calculatePrice() {
        this.totalPrice = numberOfGuests * pricePerGuest;

    }

    // Setter for number of guests
    public void setGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        if (isLargeEvent()) {
            pricePerGuest = LOWER_PRICE_PER_GUEST;
        } else {
            pricePerGuest = HIGHER_PRICE_PER_GUEST;
        }
        calculatePrice(); // automatically calculate price when setting guests
    }

    public boolean isLargeEvent() {
        return numberOfGuests >= LARGE_EVENT_THRESHOLD;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
