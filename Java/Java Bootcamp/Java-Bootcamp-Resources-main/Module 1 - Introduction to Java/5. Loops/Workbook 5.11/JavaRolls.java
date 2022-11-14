import java.util.Scanner;
import static java.lang.Math.*;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll=0;
        int score = 0;

        //Print rules
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        while(true){
            scan.nextLine();
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);
            if(diceRoll == 6){
                System.out.println("You rolled a 6. End of game");
                System.out.println("Score: " + score);
                break;

            }else if(diceRoll == 4){
                System.out.println("Zero points Keep rolling");
            }else{
                score++;
                System.out.println("One point. Keep rolling");
            }
        }
        if(score >= 3){
            System.out.println("Wow thats lucky. you win!");
        }else{
            System.out.println("Tough luck, you lose");
        }
    }

    public static int rollDice(){
        return (int)(random()*6+1);
    }
  
  

  
  
}
