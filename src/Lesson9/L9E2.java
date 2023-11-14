package Lesson9;
import java.util.*;
import java.io.File;

public class L9E2 {

    public static void exception1() {
        // exception 1 tried to divide by zero
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // exception 2 out of bounds
        try {
            int exception2 = Integer.MAX_VALUE + 1;
        } catch (Exception j) {
            System.out.println(j.toString());
        }
    }

    public static void exception3() {
        // exception 3
        try {
            int[] myArray3 = new int[5];
            int exception3 = myArray3[5];
        } catch (Exception w) {
            System.out.println(w.toString());
        }
    }

    public static void exception4() {
        // exception 4 is null
        try {
            int[] myArray4 = null;
            int exception4 = myArray4[0];
        } catch (Exception s) {
            System.out.println(s.toString());
        }
    }

    public static void exception5() {
        // exception 5 file doesnt exist
        try {
            File exception5 = new File("exception5.txt");
            Scanner scanner = new Scanner(exception5);
        } catch (Exception h) {
            System.out.println(h.toString());
        }
    }

    public static void exception6() {
        // exception 6 is a string and cant be parsed as an int
        try {
            String thisString = "Hello";
            int exception6 = Integer.parseInt(thisString);
        } catch (Exception a) {
            System.out.println(a.toString());
        }
    }

    public static void exception7() {
        // exception 7  is null so there is nothing to change to upper case
        try {
            String exception7 = null;
            System.out.println(exception7.toUpperCase());
        } catch (Exception r) {
            System.out.println(r.toString());
        }
    }
    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();

    }
}
