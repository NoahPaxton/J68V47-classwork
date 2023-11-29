package Lesson11;
import java.io.*;
import java.util.Scanner;

public class L11_noah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter timestable: ");
        int amount = Integer.parseInt(input.nextLine());
        int original = amount;
        int turn = 0;
        PrintWriter out = null;

        try {
            out = new PrintWriter("output.txt");
            for(int count = original ; count<=(original*12); count+=amount ) {
                turn++;
                out.println(original + "x" + turn + "=" + count + " ");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());

        }

    }
}