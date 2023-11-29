package Lesson11;
import java.io.*;
public class L11_E2 {
    public static void main(String[] args) {

       try{
           BufferedReader in = new BufferedReader(new FileReader("output.txt"));
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
