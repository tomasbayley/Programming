import static java.lang.Math.*;

public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
    int dice1 = (int)(random()*6 + 1);
    int dice2 = (int)(random()*6 + 1);
    System.out.println("Dice1: " + dice1);
    System.out.println("Dice2: " + dice2);

        while (dice1 != dice2){
            
            dice1 = (int)(random()*6 + 1);
            dice2 = (int)(random()*6 + 1);
            System.out.println("Dice1: " + dice1);
            System.out.println("Dice2: " + dice2);
        }

    }

}





