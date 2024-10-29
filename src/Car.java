//Implement the move() method to print "The car is moving.".
//Add an additional attribute called numDoors (type int) that represents the number of doors of the car.
// Make sure to initialize it in the constructor.
//Override the showInfo() method to also print the number of doors.

public class Car extends Vehicle {

    private final int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void move() {
        System.out.println("The car is moving.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}
