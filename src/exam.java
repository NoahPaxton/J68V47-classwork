public class exam {
    public static void main(String[] args) {
        Integer[] number = {32, 54, 64, 4, 76, 42, 79, 21, 57, 46};
        for (int index = 0; index < number.length; index++) {
            System.out.println( number[index] );

        }

        int sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7] + number[8] + number[9];
        int sum2 = sum / 10;
        System.out.println("the average score is: " + sum2);
    }
}
