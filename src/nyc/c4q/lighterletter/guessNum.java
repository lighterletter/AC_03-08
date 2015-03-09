package nyc.c4q.lighterletter;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by c4q-john on 3/8/15.
 */
public class guessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1000) + 1;
        int num;

        System.out.println("guess a number between 1 and 1000");
        num = scanner.nextInt();

        while (true) {
            if (number> num)
                System.out.println("higher!");
            else if (number<num) {
                System.out.println("lower!");
            }
            if (number == num) {
                System.out.println("Great job");
                break;
            } else
                System.out.println("guess again.");
                num = scanner.nextInt();

        }


    }
}



