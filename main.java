import java.util.Scanner;
public class main {
    public static void main(String[] args) {

       
        Driver driver1 = new Driver("James", 101);
        Driver driver2 = new Driver ("Linda", 102);

        // Create passengers
        Passenger passenger1 = new Passenger("Sarah", 201, 1001);
        Passenger passenger2 = new Passenger("Michael", 202, 1002);

       
        Bus bus1 = new Bus("KAA123B", 80, 50);
        Taxi taxi1 = new Taxi("KAB456C", 100, 12);

      
        System.out.println(driver1.getRole());
        driver1.drive();
        driver1.performMaintenance();

        System.out.println(passenger1.getRole());
        passenger1.boardVehicle();

        System.out.println("Bus fare for 15km: " + bus1.calculateFare(15));
        bus1.trackLocation();

        System.out.println("Taxi fare for 10km: " + taxi1.calculateFare(10));
        taxi1.trackLocation();

        Scanner keyboard=new Scanner (System.in);
        System.out.println("Hello Kindly enter your name");
        String name = keyboard.nextLine();
        System.out.println("Kindly enter your ID");
        int id=keyboard.nextInt();

    }
