package Lesson12;

public class L12E3 {
    public static void displayCar(car thisCar) {
        System.out.format(" %s %s (%s) %n Vin: %s %n Price: %s %n Colour: %s %n Mileage: %s %n Condition: %s %n --------------------------", thisCar.make, thisCar.model, thisCar.year, thisCar.vin, thisCar.price, thisCar.colour, thisCar.mileage, thisCar.condition);
    }

    public static void main(String[] args) {
        // create student object and display
        car f430 = new car();
        f430.make = "Ferrari";
        f430.model = "F430";
        f430.year = 2009;
        f430.vin = "3GYVKNEFXAG625569";
        f430.price = 55125;
        f430.colour = "White";
        f430.mileage = 45336;
        f430.condition = "Good";
        displayCar(f430);
        // update values of student object and display

    }
}
