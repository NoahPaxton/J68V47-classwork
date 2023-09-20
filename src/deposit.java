import java.util.Scanner;

public class deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = input.nextLine();

        System.out.print("Enter the total value of your order: ");
        float number1 = Float.parseFloat(input.nextLine());

        System.out.print("Enter the total amount you wish to pay as deposit: ");
        float number2 = Float.parseFloat(input.nextLine());

        System.out.println("=== RECEIPT === \n Customer: " + name.substring(0,1) + lastname + "\n Order Total: " + number1 + "\n Deposit paid: " + number2 + "\n Remainder: " + (number1 - number2));

        if (number2 > 100) {
            System.out.println("\n You get a free toaster!");
        }

        System.out.println("\n Have a nice day");
    }
}
