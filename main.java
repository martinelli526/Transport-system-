
    import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<Passenger> passengers = new ArrayList<>();

    static final String DRIVER_FILE = "drivers.txt";
    static final String PASSENGER_FILE = "passengers.txt";

    public static void Main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        loadDriversFromFile();
        loadPassengersFromFile();

        int choice;

        do {
            System.out.println("\n TRANSPORT SYSTEM MENU ");
            System.out.println("1. Add Driver");
            System.out.println("2. View Drivers");
            System.out.println("3. Add Passenger");
            System.out.println("4. View Passengers");
            System.out.println("5. Save Data");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = keyboard.nextInt();
            keyboard.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addDriver(keyboard);
                    break;
                case 2:
                    viewDrivers();
                    break;
                case 3:
                    addPassenger(keyboard);
                    break;
                case 4:
                    viewPassengers();
                    break;
                case 5:
                    saveDriversToFile();
                    savePassengersToFile();
                    System.out.println("Data saved successfully!");
                    break;
                case 6:
                    saveDriversToFile();
                    savePassengersToFile();
                    System.out.println("Exiting... Data saved. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        keyboard.close();
    }

    
    public static void addDriver(Scanner keyboard) {
        try {
            System.out.print("Enter driver name: ");
            String driverName = keyboard.nextLine();

            System.out.print("Enter driver ID: ");
            int driverId = keyboard.nextInt();
            keyboard.nextLine(); // consume newline

            Driver driver = new Driver(driverName, driverId);
            drivers.add(driver);

            System.out.println("Driver added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            keyboard.nextLine();
        }
    }

    
    public static void viewDrivers() {
        if (drivers.isEmpty()) {
            System.out.println("No drivers available.");
        } else {
            System.out.println("\n--- DRIVERS LIST ---");
            for (Driver d : drivers) {
                System.out.println("Name: " + d.getName() + " | ID: " + d.getId());
            }
        }
    }

    
    public static void saveDriversToFile() {
        try (FileWriter writer = new FileWriter(DRIVER_FILE)) {
            for (Driver d : drivers) {
                writer.write(d.getName() + "," + d.getId() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving drivers.");
        }
    }

    
    public static void loadDriversFromFile() {
        File file = new File(DRIVER_FILE);
        if (!file.exists()) return;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int id = Integer.parseInt(data[1]);
                drivers.add(new Driver(name, id));
            }
        } catch (Exception e) {
            System.out.println("Error loading drivers from file.");
        }
    }

    
    public static void addPassenger(Scanner keyboard) {
        try {
            System.out.print("Enter passenger name: ");
            String passengerName = keyboard.nextLine();

            System.out.print("Enter passenger ID: ");
            int passengerId = keyboard.nextInt();

            System.out.print("Enter ticket number: ");
            int ticketNumber = keyboard.nextInt();
            keyboard.nextLine();

            Passenger passenger = new Passenger(passengerName, passengerId, ticketNumber);
            passengers.add(passenger);

            System.out.println("Passenger added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            keyboard.nextLine();
        }
    }

    
    public static void viewPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers available.");
        } else {
            System.out.println("\n--- PASSENGERS LIST ---");
            for (Passenger p : passengers) {
                System.out.println("Name: " + p.getName()
                        + " | ID: " + p.getId()
                        + " | Ticket: " + p.getTicketNumber());
            }
        }
    }

    
    public static void savePassengersToFile() {
        try (FileWriter writer = new FileWriter(PASSENGER_FILE)) {
            for (Passenger p : passengers) {
                writer.write(p.getName() + "," + p.getId() + "," + p.getTicketNumber() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving passengers.");
        }
    }

    
    public static void loadPassengersFromFile() {
        File file = new File(PASSENGER_FILE);
        if (!file.exists()) return;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int id = Integer.parseInt(data[1]);
                int ticketNumber = Integer.parseInt(data[2]);
                passengers.add(new Passenger(name, id, ticketNumber));
            }
        } catch (Exception e) {
            System.out.println("Error loading passengers from file.");
        }
    }
}
