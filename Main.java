import java.util.Scanner;
import java.util.Random;
/**
 * This program chooses a random number and the user needs to guess that number
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the Scanner
    Scanner input = new Scanner(System.in);
    // create a random number generator
    Random rand = new Random();

    // get the random number to guess
    int randInt = rand.nextInt(100) + 1;

    // declare the guess variable
    int guess;

    // create a loop to keep guessing
    do {
      System.out.println("Please enter your guess between 1 and 100");
      guess = input.nextInt();

      if (guess == randInt){
        System.out.println("You are correct! Good job!");
      } else if ( guess > randInt){
      System.out.println("You are too high. Try again.!");
    } else {
      System.out.println("You are too low. Try again!");
    }
    }while (guess != randInt);
  }
}
