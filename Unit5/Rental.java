public class Rental {
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;
    public final static double EXTRA_MINUTE_RATE = 1.0;

    private String contractNumber;
    private int hours;
    private int minutes;
    private double price;

    public Rental(String contractNumber, int minutes) {
        setContractNumber(contractNumber);
        setHoursAndMinutes(minutes);
    }

    public Rental() {
        this("A000", 0);
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setHoursAndMinutes(int minutes) {
        hours = minutes / MINUTES_IN_HOUR;
        this.minutes = minutes % MINUTES_IN_HOUR;
        calculatePrice();
    }

    private void calculatePrice() {
        if (minutes <= 40) {
            price = hours * HOURLY_RATE + EXTRA_MINUTE_RATE * minutes;
        } else {
            price = (hours + 1) * HOURLY_RATE;
        }
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getPrice() {
        return price;
    }
}
