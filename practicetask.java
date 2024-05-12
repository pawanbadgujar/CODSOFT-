/*Generate a random number within a specified range, such as 1 to 100.
Prompt the user to enter their guess for the generated number and Compare the user's guess with the generated
number and provide feedback on whether the guess is correct, too high, or too low. Repeat steps 2 and 3 until
the user guesses the correct number. Display the user's score, which can be based on the number of attempts taken
or rounds won.*/

import java.io.*;
import java.util.Random;

public class practicetask {
    public static void main(String args[]) throws IOException {
        Random random = new Random();

        int guess;
        int min = 1;
        int max = 100;
        int totguesses=0;
        int randomNumber = random.nextInt(max - min + 1) + min;



        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("GUESS ANY NUMBER BETWEEN 1 TO 100:) ");
            guess = Integer.parseInt(br.readLine());
            totguesses++;

            if (guess < randomNumber) {
                System.out.println("Your guess is too low");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Congratulations! Your guess is correct");
            }
        } while (guess != randomNumber);

        System.out.println("You took " + totguesses + " attempts to guess the number.");

    }
}

