import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        try {

            System.out.print("Enter driver name: ");
            String driverName = keyboard.nextLine();

            System.out.print("Enter driver ID: ");
            int driverId = keyboard.nextInt();
            keyboard.nextLine();

            Driver driver = new Driver(driverName, driverId);

            System.out.print("Enter passenger name: ");
            String passengerName = keyboard.nextLine();

            System.out.print("Enter passenger ID: ");
            int passengerId = keyboard.nextInt();

            System.out.print("Enter ticket number: ");
            int ticketNumber = keyboard.nextInt();

            Passenger passenger = new Passenger(passengerName, passengerId, ticketNumber);

            System.out.print("Enter bus registration number: ");
            keyboard.nextLine();
            String busReg = keyboard.nextLine();

            System.out.print("Enter bus speed: ");
            double busSpeed = keyboard.nextDouble();

            System.out.print("Enter bus fare rate per km: ");
            double busRate = keyboard.nextDouble();

           
        } catch (Exception e) {
            System.out.println("Invalid input detected. Please enter the correct data type.");
        }

        keyboard.close();
    }
}
