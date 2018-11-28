import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        //Scoring system with cscore being the computer's score and uscore being user score
        Integer uscore = 0;
        Integer cscore = 0;
        Integer rounds = 0;
        //to check if the game is running and if the player wants to resume
        Boolean run = true;
        Boolean resume = true;
        //List that holds rock, paper and scissor from which the computer chooses
        List<String> rps = new ArrayList<String>();
        rps.add("rock");
        rps.add("paper");
        rps.add("scissors");
        while (run == true){
            resume = true;
            System.out.println("Choose Rock [r], Paper [p] or Scissors [s]");
            //Asks for user input
            String choose = scan.nextLine().toLowerCase();
            //Computer chooses a random index value from the list and it returns the element the index value correlates to
            String choice = rps.get(random.nextInt(3));
            //This code only works if the user chooses r, p or s
            //If they choose something else, it keeps looping over
            if ((choose.equals("r")) || (choose.equals("p")) || (choose.equals("s"))) {
                //Prints what the computer chose
                System.out.println("The computer chose: " + choice);
                //All these if statements are the individual cases for what the computer chose and what the user chose
                if (choice == "rock") {
                    rounds += 1;
                    if ("p".equals(choose)) {
                        System.out.println("You chose paper");
                        System.out.println("You win");
                        uscore += 1;
                        run = false;
                    }
                    else if ("r".equals(choose)) {
                        System.out.println("You chose rock");
                        System.out.println("You tied");
                        run = false;
                    }
                    else if ("s".equals(choose)) {
                        System.out.println("You chose scissors");
                        cscore += 1;
                        run = false;
                    }
                }
                else if (choice == "paper") {
                    rounds += 1;
                    if ("p".equals(choose)) {
                        System.out.println("You chose paper");
                        System.out.println("You tied");
                        run = false;
                    }
                    else if ("r".equals(choose)) {
                        System.out.println("You chose rock");
                        System.out.println("You lost");
                        cscore += 1;
                        run = false;
                    }
                    else if ("s".equals(choose)) {
                        System.out.println("You chose scissors");
                        System.out.println("You win");
                        uscore += 1;
                        run = false;
                    }
                }
                else if (choice == "scissors") {
                    rounds += 1;
                    if ("p".equals(choose)) {
                        System.out.println("You chose paper");
                        System.out.println("You lose");
                        cscore += 1;
                        run = false;
                    }
                    else if ("r".equals(choose)) {
                        System.out.println("You chose rock");
                        System.out.println("You win");
                        uscore += 1;
                        run = false;
                    }
                    else if ("s".equals(choose)) {
                        System.out.println("You chose scissors");
                        System.out.println("You tied");
                        run = false;
                    }
                }
                //Prints out the scoring system
                System.out.println("Rounds played: " + rounds);
                System.out.println("User score: " + uscore);
                System.out.println("Computer Score: " + cscore);
                //Asks if the user wants to continue playing and they have to respond with y or n
                System.out.println("Do you want to keep playing: [Y] or [N]");
                while (resume == true) {
                    String cont = scan.nextLine().toLowerCase();
                    if ((cont.equals("y")) || (cont.equals("n"))) {
                        if ("y".equals(cont)){
                            run = true;
                            resume = false;
                        }
                        if ("n".equals(cont)){
                            run = false;
                            resume = false;
                            System.out.println("Thanks for playing!");
                        }
                    }
                    else {
                        System.out.println("Please enter [Y] or [N]");
                    }
                }
            }
        }
    }
}
