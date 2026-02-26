public class Driver extends User implements Maintainable {


    public Driver(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Driver";
    }

    public void drive() {
        System.out.println(getName() + " is driving the vehicle.");
    }
}
    

   