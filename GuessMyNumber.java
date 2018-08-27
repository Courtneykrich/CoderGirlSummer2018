
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String PlayAgain ="";
        do { int value = (int)(Math.random()*100)+1;
            System.out.println("The Random number is "+ value);
            int guess = -1;
            System.out.println("I'm thinking of a number between 1 and 100. What is it?");
            guess = keyboard.nextInt();

            do {
                if (guess < 1 || guess > 100) {
                    System.out.println("Opps! That number is out of range.");
                    guess = keyboard.nextInt();
                } else if (guess > value) {
                    System.out.println("My number is lower");
                    guess = keyboard.nextInt();
                } else if (guess < value) {
                    System.out.println("My number is higher");
                    guess = keyboard.nextInt();
                }
            } while (guess != value);
            System.out.println("YOU GOT IT! My number is " + value);



            System.out.println("Would you like to play again? yes or no");
            PlayAgain =keyboard.next();


        }while (PlayAgain.equals("yes"));

    }


}






