package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/8/15.
 */
public class whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MM = 100;

        System.out.println("you have " + MM + " M&M's");

        while (MM > 0) {

            System.out.println("How many do you want to eat?");
            int mm = scanner.nextInt();
            MM = MM - mm;
            System.out.println("you have " + MM + " left.");
        }
            if (MM < 0)
                System.out.println("you can't eat more than what you have!");
            else
                System.out.println("You have no chocolate left! Ha!");
        }


    }



