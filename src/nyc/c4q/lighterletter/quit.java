package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/8/15.
 * for exit ticket
 * Create program that asks the user "What should I do next?",
 * and exits if the user enters "quit" or "exit."
 * Otherwise, the program keeps asking the same question.
 */
public class quit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = "";
            System.out.println("What should I do next?");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit") || (input.equalsIgnoreCase("exit"))) {
                break;
            }


        }
    }
}
