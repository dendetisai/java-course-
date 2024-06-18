abstract class Vehicle {
    public void start() {
        System.out.println("Starting");
    }
    
    abstract public void noOfWheels();
}

class Bike extends Vehicle {
    public void noOfWheels() {
        System.out.println("Bike has two wheels");
    }
}

public class main {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.noOfWheels();
        b.start();
    }
}

