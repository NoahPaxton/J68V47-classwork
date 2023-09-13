import java.util.*;
public class loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        int loan = Integer.parseInt(input.nextLine());

        System.out.print("Interest rate (APR %): ");
        int rate = input.nextInt();

        System.out.print("Number of years: ");
        int years = input.nextInt();

        float interest = ((float)rate/100) / 12;

        float monthly = (loan * (interest / (1 - (float)(Math.pow(1+interest, -(years*12))))));

        System.out.format("Monthly payment for this loan = £%.2f ", monthly);




    }
}
