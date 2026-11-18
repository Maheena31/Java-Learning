
package Games;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        System.out.println("Random Number Game");

        Random random = new Random();
        int sysInput = random.nextInt(11);

        int attempt = 0;
        boolean isGameOver = false;

        Scanner sc = new Scanner(System.in);

        while (!isGameOver) {

            System.out.println("Choose a number between 0 to 10:");
            int userInput = sc.nextInt();

            attempt++;

            if (sysInput == userInput) {
                System.out.println("Congratulations! Number matched.");
                System.out.println("Game Over!");
                isGameOver = true;
            } else {
                System.out.println("Number is not matched. Try again!");
            }

            System.out.println("User Input = " + userInput);
            System.out.println("Attempts" + attempt);
        }

        System.out.println("System Number = " + sysInput);

        sc.close();
    }
}
