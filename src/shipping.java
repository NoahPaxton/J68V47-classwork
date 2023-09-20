import java.util.Scanner;

public class shipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("total amount: ");
        int amount = Integer.parseInt(input.nextLine());

        if (amount < 50) {
            System.out.println("Your total amount is: " + (amount + 10));
        }

        else {
            System.out.println("Your total amount is: " + amount);
        }


    }
}
