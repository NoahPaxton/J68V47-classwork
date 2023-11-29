package Lesson12;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L12E4 {

    public static ArrayList<car> loadFile(String filename){
        List<String> carDetails;
        ArrayList<car> thisList = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                carDetails = Arrays.asList(line.split(","));
                car newCar = new car();
                newCar.make = carDetails.get(0);
                newCar.model = carDetails.get(1);
                newCar.year = Integer.parseInt(carDetails.get(2));
                newCar.vin = carDetails.get(3);
                newCar.price = Integer.parseInt(carDetails.get(4));
                newCar.colour = carDetails.get(5);
                newCar.mileage = Integer.parseInt(carDetails.get(6));
                newCar.condition = carDetails.get(7);
                thisList.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return thisList;
    }
    

    public static void displayCar(car thisCar){
        // note the slight change to this procedure
        System.out.format(" %s %s (%s) %n Vin: %s %n Price: %s %n Colour: %s %n Mileage: %s %n Condition: %s %n --------------------------", thisCar.make, thisCar.model, thisCar.year, thisCar.vin, thisCar.price, thisCar.colour, thisCar.mileage, thisCar.condition);
    }
    public static void main(String[] args) {
        // load file contents into an array of car objects
        ArrayList<car> thisList = loadFile("carSales.txt");
        // loop for all objects and show details
        for(int i=0;i<thisList.size();i++){
            car thisCar = thisList.get(i);
            // show details for this car
            displayCar(thisCar);

        }
    }
}
