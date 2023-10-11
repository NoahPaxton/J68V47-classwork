import java.util.Random;
import java.util.Scanner;

public class mathsquiz3 {

    public static int askQuestion(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("What is %d + %d? ",count, count*count);
        int userAnswer = scanner.nextInt();
        return userAnswer;


    }

    public static int correctAnswer(int score) {
        System.out.println("CORRECT!");
        score++;
        return score;

    }


    public static int wrongAnswer(int answer, int lives) {
        System.out.format("WRONG! The answer is %d %n", answer);
        lives--;
        return lives;
    }

    public static void gameOver(int score, int lives) {
        System.out.format("GAME OVER. Your final score is %d %n",score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer;
        int count = 1;
        while (count <= 10 && lives > 0){
            askQuestion(count);
            answer = count + (count*count);
            if (answer == userAnswer){
                correctAnswer(score);

            } else {
                wrongAnswer(answer, lives);
                System.out.format("You have %d lives left. %n", lives);
            }
            count++;
        }

    }
}

