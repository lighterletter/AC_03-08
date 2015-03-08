package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/8/15.
 */
public class addingLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int temp, number=0;

        System.out.println("I will add up the numbers you give me");
        System.out.println("Enter zero to stop the program");
        temp = scanner.nextInt();

        while (temp != 0 ) {
            number =+ temp;
            System.out.println("Total so far is " + number);
            System.out.println("please enter a different number;");
            temp = scanner.nextInt();




        }
    }
}
