import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of Scotland: ");
        String scotland = input.nextLine();
        System.out.println(scotland.toLowerCase().contains("edinburgh"));

        System.out.print("What is the capital of Germany: ");
        String germany = input.nextLine();
        System.out.println(germany.toLowerCase().contains("berlin"));

        System.out.print("What is the capital of Uganda: ");
        String uganda = input.nextLine();
        System.out.println(uganda.toLowerCase().contains("kampala"));


    }
}
