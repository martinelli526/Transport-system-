public abstract class vehicle {

    private String registrationNumber;
    private double speed;

    // Constructor
    public Vehicle(String registrationNumber, double speed) {
        this.registrationNumber = registrationNumber;
        this.speed = speed;
    }

    // Getters and Setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Abstract method
    public abstract double calculateFare(double distance);
} {
    
}
