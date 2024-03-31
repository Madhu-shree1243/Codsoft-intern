import java.util.Random;
import java.util.Scanner;

public class TASK1{
    public static void main(String args[]){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int randomNumber = rand.nextInt(100) + 1 ;
        System.out.println(" Random Number is  " + randomNumber );

        int tryCount = 0;
        while(true) { // now taking while loop.

        
        System.out.println("Enter your guess (1-100):");
 
        


       int playerGuess = sc.nextInt();
       tryCount++; // we take try count because for the user knows about how much tries the guessing game.


       if(playerGuess == randomNumber)

       {

        System.out.println("HURRAY!! YOU GOT IT");
        System.out.println(" It took you " + tryCount + " tries . ");


        break;


       }

       else if(randomNumber > playerGuess ) 
       
       {


        System.out.println("OOPS! Your number is higher.Guess again.");

       }

       else{
        System.out.println("Nope! The number is lower.Guess again");
       }

    }


    }
}