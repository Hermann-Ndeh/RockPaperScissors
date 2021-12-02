/**
 * @author Hermann Nji Ndeh
 * 11/22/2021
 * this is a game of rock paper scissors
 * 1 = rock, 2 = paper, 3 = scissors 
 * TO PLAY: in RockPaperScissors directory; "javac *.java", then "java RockPaperScissors" when it compiles
 * when the user clicks on a button the arrnagement of the buttons will change depending on the outcome of the round 
 * after the game is over the game will create and output a file with the scoreboard
 * THANK YOU FOR PLAYING
 */
import java.util.*;


public class RockPaperScissors{

    /**
     * asks for user input and executes the buttoncommands from the gui
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asks user to enter their username
        System.out.print("Enter your userName: ");
        String userName = input.nextLine();

        //prints out welcome message and instructions on how to play the game
        System.out.println();
        System.out.println("                Hello " + userName + " Welcome to Rock Paper Scissors, below are the instructions");
        System.out.println();
        System.out.println("          To play the game, you click the button representing the play you want, rock, paper, or scissors.");
        System.out.println("          The cpu generates a random number that represents one a the plays to combat you");
        System.out.println("          based on the outcome of each round, the arrangement of the tiles will chnage");
        System.out.println("          when the game is over and you click the quit button(the game can be played infinitely)");
        System.out.println("          A message box will pop up with further instructions");
        System.out.println();

        System.out.print("Press Enter to continue...");
        String begin = input.nextLine();

        //runs code from gui class
        RockPaperScissorsGUI rps = new RockPaperScissorsGUI(640, 480);
        rps.setUpGUI();
        rps.setUpButtonListeners();
    }

    
}




