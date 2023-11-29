import java.lang.reflect.Array;
import java.util.*;
public class doctordirections {

    public static String[] addToStringArray(String[] directions ) {
        String[] newArray = Arrays.copyOf(directions, directions.length + 1);
        newArray[4] = ("After turning onto Elm Street, walk past the grocery store on your right.");
        newArray[5] = ("Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.");
        newArray[6] = ("Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.");
        newArray[7] = ("Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!");
        return newArray;
    }


    public static String[] addToStringArray1(String[] test ) {
        String[] newArray1 = Arrays.copyOf(test, test.length - 1);
        return newArray1;
    }
    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn  left onto Elm Street.",
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

        System.out.println(" ");

        String[] test = addToStringArray(directions);
        int step1 = 1;
        for(String test2 : test) {
            System.out.format("%d. %s %n", step1,test2);
            step1 ++;
        }

        System.out.println(" ");

        String[] test4 = addToStringArray1(test);
        int step2 = 1;
        for(String test3 : test4) {
            System.out.format("%d. %s %n", step2,test3);
            step2 ++;
        }
    }

}