import java.util.Random;
import java.util.Scanner;

public class mathsquiz2 {
    public static void main(String[] args) {
        int score = 0;
        int lives = 3;
        while (lives >=1 && score <=10 ) {
            Random rand = new Random();
            int upperbound = 10;

            int question1 = rand.nextInt(upperbound);
            int question1_1 = rand.nextInt(upperbound);

            Scanner input = new Scanner(System.in);
            System.out.print("what is " + question1 + " x " + question1_1 + ": ");
            int answer1 = Integer.parseInt(input.nextLine());

            if (question1 * question1_1 == answer1) {
                score++;
            }

            else {
                lives --;
                System.out.println("you lost a life. " + lives + " remaining");
            }


        }
        System.out.println("you got " + score + " out of 10 correct");
        lives -=3;


    }
}
