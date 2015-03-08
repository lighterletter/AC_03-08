package nyc.c4q.lighterletter;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Hey, how are you feeling?");
        String emoticon = input.nextLine();



            if (emoticon.equals(":)"))
                System.out.println("Great!");
            else if (emoticon.equals(":("))
                System.out.println("Not so great!");
            else if (emoticon.equals("-_-"))
                System.out.println("What's the dealio!?");
            else if (emoticon.equals("xD"))
                System.out.println("hehehehehe.");
            else {
                System.out.println("I don't know that one! :(");
                emoticon = "???";
            }

            System.out.println("You're" + emoticon );
        }
    }

