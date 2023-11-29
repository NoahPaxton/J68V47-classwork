package Lesson11;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class L11_E4 {


    public static String reading(BufferedReader in) {

        return in.lines()
                .collect(Collectors.joining(System.lineSeparator()));

    }

    public static String reading2(BufferedReader in2) {

        return in2.lines()
                .collect(Collectors.joining(System.lineSeparator()));

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first filename");
        String file1 = input.nextLine();

        System.out.println("Enter the second filename");
        String file2 = input.nextLine();


        try {
            BufferedReader in = new BufferedReader(new FileReader(file1));
            BufferedReader in2 = new BufferedReader(new FileReader(file2));

            String line1 = "";
            String line2;


            line1 = reading(in);


            line2 = reading2(in2);


            if (line1.equals(line2)) {
                System.out.println("they are the same");
            }

            else {
                System.out.println("they are different");
            }

        } catch (IOException e) {
            System.out.println("error reading file");
        }


    }
}
