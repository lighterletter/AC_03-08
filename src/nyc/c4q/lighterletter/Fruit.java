package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/8/15.
 */

import java.util.Scanner;
public class Fruit {
    public static void main(String[] args) {

        System.out.println("name your favorite fruit!");
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();

        String color;
        String flavor;


        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        } else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        } else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        } else if (fruit.equals("apple")) {
            color = "red or green";
            flavor = "sour or sweet";
        } else {
            System.out.println("I don't know that fruit.");
            return;
        }
        System.out.println("a " + fruit + " is " + color + " and tastes " + flavor + " !");
    }
}
