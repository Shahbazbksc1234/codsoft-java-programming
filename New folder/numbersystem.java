import java.util.Random;
import java.util.Scanner;

public class numbersystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numb = new Random();
        int MAX_THRESHOLD = 100;
        int UserAttempts = 0;
        int numb1 = numb.nextInt(MAX_THRESHOLD);
        int checker = 0;

        System.out.println("Welcome to Number Guessing Game in JAVA-CLI");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Level 1");
        System.out.println("Score = 0 ");


        while (checker != 3) {  // Continue the loop until the user guesses correctly
            System.out.println("Enter your guess: ");
            int guess_input = sc.nextInt();
            if (guess_input == numb1) {
                System.out.println("Congratulations, your guess is correct! ");
                checker = 3;
            } else if (numb1 < guess_input) {
                System.out.println("Your guess is higher than the target");
                checker = 2;
            } else {
                System.out.println("Your guess is lower than the target");
                checker = 1;
            }
            UserAttempts += 1;
            System.out.println("Your Total Score: " + UserAttempts);
        }
    }
}