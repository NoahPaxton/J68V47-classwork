import java.util.Scanner;

public class mathsquiz4 {

    public static int askQuestion(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("What is %d + %d? ",count, count*count);
        int userAnswer = scanner.nextInt();
        return userAnswer;


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
                System.out.println("CORRECT!");
                score++;
            } else {
                System.out.format("WRONG! The answer is %d %n", answer);
                lives--;
                System.out.format("You have %d lives left. %n", lives);
            }
            count++;
        }
        System.out.format("GAME OVER. Your final score is %d %n",score);
        if (lives > 0){
            System.out.println("Well done!");
        }
    }
}
