import java.util.*;
public class hobby {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your hobby? ");
        String hobby = input.nextLine();

        System.out.println(name + " Loves " + hobby + " in their free time.");
        System.out.println("They find it relaxing and satisfying to see their " + hobby + " come to life");
        System.out.println(hobby + " allows " + name + " to express their creative side");
    }
}
