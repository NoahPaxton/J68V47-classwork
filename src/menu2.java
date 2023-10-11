import java.time.LocalTime;
import java.util.Scanner;

public class menu2 {

    public static void ShowMenu() {
        
        System.out.println("1) Say hello\n2)Tell me the time\n3) Tell me what 2x2 is\n4) quit");

    }

    public static int getOption() {

        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
    
    public static void main(String[] args) {
        int quit = 0;
        int option = 0;
        do {
            ShowMenu();
            option = getOption();
            if (option == 1) {
                System.out.println("Hello");
            }

            else if (option == 2) {
                System.out.println(LocalTime.now());
            }


            else if (option == 3) {
                System.out.println("4");
            }

            else if (option == 4) {
                System.out.println("Bye!");
            }

            else System.out.println("This isn't a valid option. Try a number between 1 and 4");

        } while(option != 4);


    }
}
