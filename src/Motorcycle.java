//Implement the move() method to print "The motorcycle is moving.".
//Add an additional attribute called engineCapacity (type int) that represents the engine capacity of the motorcycle.
// Make sure to initialize it in the constructor.
//Override the showInfo() method to also print the engine capacity.

public class Motorcycle extends Vehicle {

    private final int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Engine capacity: " + engineCapacity);
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving.");
    }
}
