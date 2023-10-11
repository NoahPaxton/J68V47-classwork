import java.util.*;
public class integer {

    public static int calculateSum(int number1, int number2) {

    int sum = number1 + number2;
    return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the second number: ");
        int number2 = Integer.parseInt(input.nextLine());

       System.out.println("the sum of" + number1 + number2 + "is" + calculateSum(number1, number2));
    }
}
