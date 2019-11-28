import java.util.Scanner;

//imports a scanner
public class Main {


    public static void main(String[] args) {
        char rock = 'r';
        char paper = 'p';
        char scissors = 's';
        char exit = 'x';
        int playerScore = 0;
        int computerScore = 0;
        int stop = 0;
        //declaring rock paper and scissor variable;
        Scanner scan = new Scanner(System.in); //scanner thingy

        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");
        do {
            System.out.println("*********************************************" + "\n" + "Wins: " + playerScore + "\t" + "Losses: " + computerScore + "\n" + "Players Choice:");
            char choice = scan.next().charAt(0);
            int random = (int)(Math.random() * 100);

            if (choice == rock) { //if i choose rock what happens
                if (random < 33) { //if random number is less than 33 it is rock
                    System.out.println("Draw! \nComputer Choice:rock \tPlayer Choice: rock");
                    //Output telling you its a draw, and what you chose vs what the computer chose
                } else if (random > 66) { //if random number is greater than 66 it is paper
                    System.out.println("You lose! \nComputer Choice: paper \tPlayer Choice: rock");
                    computerScore++;
                    //Output telling you ur a loser, and what you chose vs what the computer chose
                } else { //if number is between 33 and 66 it is scissors
                    System.out.println("You win! \nComputer Choice: scissors \tPlayer Choice: rock"); //win if random number is between 33 and 66
                    playerScore++;
                    //Output telling you ur a winner, and what you chose vs what the computer chose
                }
            } else if (choice == paper) {
                if (random < 33) {
                    System.out.println("You win! \nComputer Choice: rock \tPlayer Choice: paper");
                    playerScore++;
                    //Output telling you ur a winner, and what you chose vs what the computer chose
                } else if (random > 66) {
                    System.out.println("Draw! \nComputer Choice: paper \tPlayer Choice: paper");
                    //Output telling you its a draw, and what you chose vs what the computer chose
                } else {
                    System.out.println("You lose! \nComputer Choice: scissors \tPlayer Choice: paper");
                    computerScore++;
                    //Output telling you ur a loser, and what you chose vs what the computer chose
                }
            } else if (choice == scissors) {
                if (random < 33) {
                    System.out.println("You lose! \nComputer Choice: rock \tPlayer Choice: scissors");
                    computerScore++;
                    //Output telling you ur a loser, and what you chose vs what the computer chose
                } else if (random > 66) {
                    System.out.println("You win! \nComputer Choice: paper \tPlayer Choice: scissors");
                    playerScore++;
                    //Output telling you ur a winner, and what you chose vs what the computer chose
                } else {
                    System.out.println("Draw! \nComputer Choice: scissors \tPlayer Choice: scissors");
                    //Output telling you its a draw, and what you chose vs what the computer chose
                }
            }
            else if (choice == exit) {
                System.out.println("Thank you for playing!");
                stop++;
            }
            else {
                System.out.println("Invalid selection please play again.");
                //Output telling you that you can't read, and you didn't enter the right character
            }

        } while (stop != 1);
    }
}
