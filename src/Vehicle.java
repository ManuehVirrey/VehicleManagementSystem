//Create an abstract base class called Vehicle that has the following attributes:
//brand (type String): the brand of the vehicle.
//model (type String): the model of the vehicle.
//year (type int): the year of manufacture of the vehicle.
//The class should have a constructor that initializes the mentioned attributes.
//It must implement the Movable interface but leave the move() method as abstract so that derived classes implement it.
//The Vehicle class should also have a method called showInfo() that prints the brand, model, and year of the vehicle.

public abstract class Vehicle implements Movable {

    private final String brand;
    private final String model;
    private final int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void move();

    public void showInfo() {
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);

    }
}

