package Lesson9;

import java.util.Scanner;

public class L9E3 {

    public static int askQuestion(int number1, int number2){

        Scanner scanner = new Scanner(System.in);
        System.out.format("What is %d + %d? ",number1, number2);
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }

    public static int correctAnswer(int score, boolean errorFlag){
        try {
            System.out.println("CORRECT!");
            score++;
        } catch (Exception d) {
            System.out.println("error occured");
            errorFlag = true;
        }
        return score;
    }

    public static int wrongAnswer(int answer, int lives, boolean errorFlag){
        try {
            System.out.format("WRONG! The answer is %d %n", answer);
            lives--;
            System.out.format("You have %d lives left. %n", lives);
        } catch (Exception e) {
            System.out.println("error occured");
            errorFlag = true;


        }
        return lives;

    }

    public static void gameOver(int score, int lives){
        System.out.format("GAME OVER. Your final score is %d %n",score);
        if (lives > 0){
            System.out.println("Well done!");
        }
    }
    public static void main(String[] args) {
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;
        boolean errorFlag = false;
        while (count <= 10 && lives > 0){
            try {
                userAnswer = askQuestion(count, count * count);
                answer = count + (count * count);
                if (answer == userAnswer) {
                    score = correctAnswer(score, errorFlag);
                } else {
                    lives = wrongAnswer(answer, lives, errorFlag);
                }
                count++;
            } catch (Exception c) {
                System.out.println("error occured");
                errorFlag = true;
            }
        }
        gameOver(score, lives);
        if (!errorFlag) {
            System.out.println("This message only displays if there is no error!");
        }
    }



}

