package Lesson11;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class L11_E3 {


    public static void main(String[] args) {
        try ( Scanner in = new Scanner( new FileReader("numbers.txt") ) ) {
            int[] numbers = new int[8];
            for (int i = 0; i < numbers.length; i++) {
                int num = in.nextInt();
                numbers[i] = num;
            }
            int sum = 0;


            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }


            System.out.println("the sum is " + sum) ;
        } catch (IOException e) {
            System.out.println("Error occurred reading from file: " + e.toString());
        }



    }
}
