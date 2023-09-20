import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of Scotland: ");
        String scotland = input.nextLine();

        if (!scotland.toLowerCase().equals("edinburgh")) {
            System.out.println("Sorry, the correct answer is edinburgh");
        }

        System.out.print("What is the capital of Germany: ");
        String germany = input.nextLine();
        if (!germany.toLowerCase().equals("berlin")) {
            System.out.println("Sorry, the correct answer is berlin");
        }


        System.out.print("What is the capital of Uganda: ");
        String uganda = input.nextLine();
        if (!uganda.toLowerCase().equals("kampala")) {
            System.out.println("Sorry, the correct answer is kampala");
        }


    }
}
