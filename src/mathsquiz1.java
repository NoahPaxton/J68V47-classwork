import java.util.Random;
import java.util.Scanner;

public class mathsquiz1 {
    public static void main(String[] args) {
        int score = 0;

        for( int count=1; count<=10; count++)
        {
            Random rand = new Random();
            int upperbound=10;

            int question1 = rand.nextInt(upperbound);
            int question1_1 = rand.nextInt(upperbound);

            Scanner input = new Scanner(System.in);
            System.out.print("what is " + question1 + " x " + question1_1 + ": ");
            int answer1 = Integer.parseInt(input.nextLine());

            if (question1 * question1_1 == answer1 ) {
                score++;


            }
        }
        System.out.println("you got " + score + " out of 10 correct");

    }
}
