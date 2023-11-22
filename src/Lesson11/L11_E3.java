package Lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L11_E3 {
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new FileReader("numbers.txt"));
            String line;
            do {
                line = in.readLine();
                System.out.println(line);

            } while (line != null);

        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());

        }


    }
}
