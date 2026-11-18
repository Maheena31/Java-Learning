package Games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Please Enter the Below Option");
        System.out.println("0.Rock\n 1.Paper\n 2.Scissor\n");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random = new Random();
        int sysInput = random.nextInt(3);

        if(userInput == sysInput){

            System.out.println("Draw");
        }

        else if((userInput == 0 && sysInput == 2)||(userInput == 1 && sysInput ==0)){
            System.out.println("Hurray You Win!");
        }

        else{
            System.out.println("Oohh You Lose:(");
        }

        System.out.println("User Input =" +userInput);
        System.out.println("System Input = "+sysInput);
    }


}
