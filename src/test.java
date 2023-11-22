import java.io.*;

public class test {


    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter("output.txt");
            out.println("Hello World");
            out.println(3.14);
            out.format("%d x %d = %d%n", 3, 4, 3*4);
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());

        }

    }
}