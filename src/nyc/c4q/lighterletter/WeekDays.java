package nyc.c4q.lighterletter;

/**
 * Created by john gomez on 3/8/15.
 *
 * pair with Hanbi Choi
 * program reads day input and print whether its a weekday or weekend. otherwise user receives "invalid input" message
 */

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day ="";

        System.out.println("Enter a day of the week.");
        day = scanner.nextLine();

        if (day.equalsIgnoreCase("Saturday") ||
                day.equalsIgnoreCase("Sunday"))
                System.out.println("It's a weekend!!");
        else if
            (day.equalsIgnoreCase("monday")
                        || day.equalsIgnoreCase("tuesday")
                        || day.equalsIgnoreCase("wednesday")
                        || day.equalsIgnoreCase("thursday")
                        || day.equalsIgnoreCase("friday"))
            System.out.println("It's a weekday!");
        else
                System.err.println("Invalid input :(");

        }

    }


