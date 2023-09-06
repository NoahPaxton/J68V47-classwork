import java.util.*;
public class supermarket_sweep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of item 1: ");
        String name = input.nextLine();

        System.out.print("Enter the price of item 1: ");
        float price1 = Float.parseFloat(input.nextLine());

        System.out.print("Enter the name of item 2: ");
        String name2 = input.nextLine();

        System.out.print("Enter the price of item 2: ");
        float price2 = Float.parseFloat(input.nextLine());

        System.out.print("Enter the name of item 3: ");
        String name3 = input.nextLine();

        System.out.print("Enter the price of item 3: ");
        float price3 = Float.parseFloat(input.nextLine());


        System.out.format(name + "..........%.2f %n", price1);
        System.out.format(name2 + "..........%.2f %n", price2);
        System.out.format(name3 + "..........%.2f %n", price3);
        System.out.format("SUBTOTAL..........%.2f %n", price1 + price2 + price3);



    }
}
