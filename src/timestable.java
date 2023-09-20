import java.util.Scanner;

public class timestable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter timestable: ");
        int amount = Integer.parseInt(input.nextLine());
        int original = amount;
        int turn = 0;
        for(int count = original ; count<=(original*12); count+=amount )
        {
            turn++;
            System.out.println(original + "x" + turn + "=" + count + " ");
        }
    }
}
