//Create a class called Garage that manages a collection of vehicles. This class should have the following methods:
//addVehicle(Vehicle vehicle): this method should add a vehicle to a static list of up to 5 vehicles.
//showVehicles(): this method should loop through the list and call the showInfo() method of each vehicle.
//moveAll(): this method should loop through the list and call the move() method of each vehicle, showing how each vehicle moves.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage {

    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();


    public static void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("The vehicle was added successfully.");
    }

    public static void showVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("There are no vehicles in the garage.");
        } else {
            for (Vehicle vehicle : vehicles) {
                vehicle.showInfo();
                System.out.println("------------------");
            }
        }
    }

    public static void moveAll() {
        if (vehicles.isEmpty()) {
            System.out.println("There are no vehicles to move.");
        } else {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
            }
        }
    }
}
