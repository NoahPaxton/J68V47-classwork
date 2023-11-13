import java.lang.reflect.Array;
import java.util.*;
public class doctordirections {

    public static String[] addToStringArray(String[] directions) {
        String[] newArray = Arrays.copyOf(directions, directions.length + 1);
        return newArray;
    }
    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn  left onto Elm Street.",
                "After turning onto Elm Street, walk past the grocery store on your right.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };

        // Print out each direction
        int step = 1;
        for(String direction : directions) {
            System.out.format("%d. %s %n",step,direction);
            step ++;
        }
        System.out.println(directions.length+1);
        String[] directions2 = addToStringArray(directions);

        int step1 = 1;
        for (String direction2 : directions2) {
            System.out.format("%d. %s %n", step,direction2);
            step1 ++;
        }
    }

}