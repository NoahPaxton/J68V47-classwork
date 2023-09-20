import java.util.Scanner;
import java.util.*;
public class mathsquiz {
    public static void main(String[] args) {
        for( int count=1; count<=10;)
        {
            int score = 0;

            Scanner input = new Scanner(System.in);
            System.out.print("what is 5x7: ");
            int question1 = Integer.parseInt(input.nextLine());
            if (question1 == 35) {
                score++;
            }
            count++;

            System.out.print("what is 3x2: ");
            int question2 = Integer.parseInt(input.nextLine());
            if (question2 == 6) {
                score++;
            }
            count++;

            System.out.print("what is 4x8: ");
            int question3 = Integer.parseInt(input.nextLine());
            if (question3 == 32) {
                score++;
            }
            count++;

            System.out.print("what is 2x5: ");
            int question4 = Integer.parseInt(input.nextLine());
            if (question4 == 10) {
                score++;
            }
            count++;

            System.out.print("what is 3x8: ");
            int question5 = Integer.parseInt(input.nextLine());
            if (question5 == 24) {
                score++;
            }
            count++;

            System.out.print("what is 6x2: ");
            int question6 = Integer.parseInt(input.nextLine());
            if (question6 == 12) {
                score++;
            }
            count++;

            System.out.print("what is 8x3: ");
            int question7 = Integer.parseInt(input.nextLine());
            if (question7 == 24) {
                score++;
            }
            count++;

            System.out.print("what is 4x7: ");
            int question8 = Integer.parseInt(input.nextLine());
            if (question8 == 27) {
                score++;
            }
            count++;

            System.out.print("what is 5x9: ");
            int question9 = Integer.parseInt(input.nextLine());
            if (question9 == 45 ) {
                score++;
            }
            count++;

            System.out.print("what is 3x6: ");
            int question10 = Integer.parseInt(input.nextLine());
            if (question10 == 18) {
                score++;
            }
            count++;

            System.out.println("you got " + score + " out of 10 correct");
        }
    }
}
