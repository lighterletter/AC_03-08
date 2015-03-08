package nyc.c4q.lighterletter;

/*John Gomez C4Q 2015
Pair with Hanbi Choi
This program asks for your mood in emoticon and prints out an appropriate reaction.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Hey, how are you feeling? (your answer should be an emoticon)");
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

            System.out.println("You're " + emoticon );
        }
    }

