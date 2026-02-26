public class Bus extends Vehicle implements Trackable {

    private int capacity;

    
    public Bus(String registrationNumber, double speed, int capacity) {
        super(registrationNumber, speed);  
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity; 
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

 
    @Override
    public double calculateFare(double distance) {
      
        return distance * 5;
    }

    
    @Override
    public void trackLocation() {
        System.out.println("Bus " + getRegistrationNumber() + " is on the route.");
    }
 
    
}
