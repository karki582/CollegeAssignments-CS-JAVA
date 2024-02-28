public class Rental {
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;

    public final static double EXTRA_MINUTE_RATE = 1.0;

    private String contractNumber;
    private int hours;
    private int extraMinutes;
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
        extraMinutes = minutes % MINUTES_IN_HOUR;
        price = hours * HOURLY_RATE + extraMinutes * EXTRA_MINUTE_RATE;
    }



    public String getContractNumber() {
        return contractNumber;
    }

    public int getHours() {
        return hours;
    }

    public int getExtraMinutes() {
        return extraMinutes;
    }

    public double getPrice() {
        return price;
    }
}
