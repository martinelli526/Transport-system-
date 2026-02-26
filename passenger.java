public class Passenger extends User {

    private int ticketNumber;

    
    public Passenger(String name, int id, int ticketNumber) {
        super(name, id); 
        this.ticketNumber = ticketNumber;
    }

    
    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    
    @Override
    public String getRole() {
        return "Passenger";
    }

    
    public void boardVehicle() {
        System.out.println(getName() + " is boarding the vehicle.");
    }
}