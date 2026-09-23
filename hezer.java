import java.util.Random;
import java.util.Scanner;
public class hezer{
    public static void main(String[] args){
        int computerChoice;
        String playerChoice;
        String computerMove="";
        int player=0;
        int computer=0;
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       System.out.println("Lets play Rock Paper Scissors!!!");
       System.out.println("Whoever is 3 wons!");
       while (player<3&&computer<3){
            System.out.println("Choose! Rock Paper or Scsissors?");
            computerChoice = random.nextInt(3);
            if(computerChoice==0){
                computerMove="rock";
            }
            else if (computerChoice==1){
                computerMove="paper";
            }
            else if(computerChoice==2){
                computerMove="scissors";
            }
            playerChoice=scanner.nextLine().toLowerCase(); 
            if (computerMove.equals(playerChoice)) {
                System.out.println("Draw!!!");
            }
            else if (computerMove.equals("rock") && playerChoice.equals("paper")) {
                player += 1;
                System.out.println("Player Wins! Player's point is " + player);
                if (player == 3) break;
            }
            else if (computerMove.equals("rock") && playerChoice.equals("scissors")) {
                computer += 1;
                System.out.println("Computer Wins! Computer's point is " + computer);
                if (computer == 3) break;
            }
            else if (computerMove.equals("paper") && playerChoice.equals("rock")) {
                computer += 1;
                System.out.println("Computer Wins! Computer's point is " + computer);
                if (computer == 3) break;
            }
            else if (computerMove.equals("paper") && playerChoice.equals("scissors")) {
                player += 1;
                System.out.println("Player Wins! Player's point is " + player);
                if (player == 3) break;
            }
            else if (computerMove.equals("scissors") && playerChoice.equals("rock")) {
                player += 1;
                System.out.println("Player Wins! Player's point is " + player);
                if (player == 3) break;
            }
            else if (computerMove.equals("scissors") && playerChoice.equals("paper")) {
                computer += 1;
                System.out.println("Computer Wins! Computer's point is " + computer);
                if (computer == 3) break;
            }
       }
       if(computer==3){
        System.out.println("Computer wins!!!");
       }
        else if (player==3){
            System.out.println("You won!");
        }
       
    }
}
