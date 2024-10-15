package TAUresource;
import java.util.Random;

public class MuscleMemory {

    public static void main(String[] args) {
        //roll the dice optional independent challenge
        /*
        Objective/rules
        -if they exceed or have traveled less than 20 spaces by their fifth turn they lose
        -only have 5 rolls
        -if they get to 20 before their 5th roll they win
         */
Random random = new Random();

        System.out.println("Let's play a dice game! \n The goal is to travel the entire" +
                " board of 20 spaces in just FIVE ROLLS!");

        int diceRolls = 5;
        int boardSpaces = 20;
        int currentSpace = 0;

        for(int i = 0; i<diceRolls && currentSpace <boardSpaces; i++){
            int dice = random.nextInt(6)+1;
            System.out.println("You've rolled a " + dice);
            currentSpace += dice;
            if(currentSpace < boardSpaces){
                System.out.println("You've advanced to space " + currentSpace);
            }else if(currentSpace > boardSpaces) {
                System.out.println("you've exceeded the spaces on the board");
            }
            else{
                System.out.println("YOU WIN! You've traveled all 20 spaces on the board");
            }
        }
      if(currentSpace != boardSpaces){
            System.out.println("YOU LOSE!");
        }
    }

}
