//In the main Main class, perform the following actions:
//Create a Garage.
//Create multiple objects of type Car and Motorcycle.
//Use the addVehicle() method to add vehicles to the garage.
//Call the showVehicles() and moveAll() methods to display the information and movement of each vehicle.
//In the Main class show a menu that allow to choose one of these options:
//
//                                    --- Vehicle Management System ---
//                                         1. Add a Car
//                                         2. Add a Motorcycle
//                                         3. Show all vehicles in the garage.
//                                         4. Move all vehicles.
//                                         5. Exit.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Garage garage = new Garage();
        int option;
        do {
            System.out.println("Vehicle Management System");
            System.out.println(" 0. Exit.");
            System.out.println(" 1. Add a Car");
            System.out.println(" 2. Add a Motorcycle");
            System.out.println(" 3. Show all vehicles in the garage.");
            System.out.println(" 4. Move all vehicles.");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            switch (option) {
                case 0:
                    System.out.println("You have ended the program.");
                    break;
                case 1:
                    System.out.print("Enter the brand: ");
                    String brandC = sc.next();
                    System.out.print("Enter the model: ");
                    String modelC = sc.next();
                    System.out.print("Enter the year: ");
                    int yearC = sc.nextInt();
                    System.out.print("Enter the number of doors: ");
                    int numDoors = sc.nextInt();
                    Vehicle car = new Car(brandC, modelC, yearC, numDoors);
                    Garage.addVehicle(car);
                    System.out.println("Car added successfully \n");
                    break;
                case 2:
                    System.out.print("Enter the brand: ");
                    String brandM = sc.next();
                    System.out.print("Enter the model: ");
                    String modelM = sc.next();
                    System.out.print("Enter the year: ");
                    int yearM = sc.nextInt();
                    System.out.print("Enter the engine capacity: ");
                    int engineCapacity = sc.nextInt();
                    Vehicle motorcycle = new Motorcycle(brandM, modelM, yearM, engineCapacity);
                    Garage.addVehicle(motorcycle);
                    System.out.println("Motorcycle added successfully \n");
                    break;
                case 3:
                    Garage.showVehicles();
                    break;
                case 4:
                    Garage.moveAll();
                    break;
                default:
                    System.out.println("That option is not valid, please select another option \n");
            }
        }while(option != 0);
    }
}