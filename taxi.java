public class Taxi extends Vehicle implements Trackable {

    private double ratePerKm;

    
    public Taxi(String registrationNumber, double speed, double ratePerKm) {
        super(registrationNumber, speed);
        this.ratePerKm = ratePerKm;
    }

    
    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    
    @Override
    public void trackLocation() {
        System.out.println("Taxi " + getRegistrationNumber() + " is being tracked.");
    }
}