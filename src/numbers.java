import java.util.*;
public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int number1 = Integer.parseInt(input.nextLine());

        System.out.print("What is the second number? ");
        int number2 = Integer.parseInt(input.nextLine());

        float divide = (float) number1 / number2;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(divide);
        System.out.println(number1 % number2);
        System.out.println(number1 ^ number2);


    }
}
