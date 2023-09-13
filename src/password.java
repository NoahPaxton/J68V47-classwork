import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = input.nextLine();

        System.out.print("Enter your year of birth: ");
        String birth = input.nextLine();

        System.out.print("Username: " + name.toUpperCase().substring(0,1) + lastname.toLowerCase() + "\npassword: " + lastname.toLowerCase().substring(0,1) + name.toUpperCase() + birth);


    }
}
