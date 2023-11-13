import java.util.Scanner;

public class lesson_7_maths {

    public static int askQuestion(int count) {
        Scanner input = new Scanner(System.in);
        System.out.format("What is %d + %d? ",count, count*count);
        int userAnswer;
        userAnswer = input.nextInt();
        return userAnswer;
    }

    public static int correctAnswer(int score) {
        System.out.println("Correct!");
        score++;
        return score;
    }

        public static int wrongAnswer(int answer, int lives) {
            System.out.println("Wrong! The answer is: " + answer);
            lives--;
            System.out.println("you have " + lives + " lives left.");
            return lives;
        }

        public static void gameOver(int score, int lives) {
            System.out.println("Game over. Your score is " + score);
            if (lives > 0) {
                System.out.println("Well done!");
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int lives = 3;
        int userAnswer;
        int answer;
        int count = 1;
        while (count <= 10 && lives > 0){
            userAnswer = askQuestion(count);
            answer = count + (count*count);
            if (answer == userAnswer){
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver(score, lives);
        }
    }

