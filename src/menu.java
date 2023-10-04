import java.time.LocalDateTime;
import java.time.LocalTime;
import  java.util.*;
public class menu {
    public static void main(String[] args) {
        int quit = 0;

        while( quit==0 )
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1) Say hello\n2)Tell me the time\n3) Tell me what 2x2 is\n4) quit");
            int option = Integer.parseInt(input.nextLine());

            if ( option ==1 ) {
                System.out.println("Hello");
            }

            if ( option == 2 ) {
                System.out.println(LocalTime.now());
            }


            if ( option == 3 ) {
                System.out.println("4");
            }

            if (option == 4) {
                quit ++;

            }
        }


    }
}
