import java.util.Random;
import java.util.Scanner;

public class Ludo {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int player = 1;

        // Player 1 tokens
        int player1Token1 = 0;
        int player1Token2 = 0;
        int player1Token3 = 0;
        int player1Token4 = 0;

        // Player 2 tokens
        int player2Token1 = 0;
        int player2Token2 = 0;
        int player2Token3 = 0;
        int player2Token4 = 0;

        System.out.println("Welcome to Ludo Game!");

        while (true) {

            System.out.println();
            System.out.println("Player " + player + " turn");
            System.out.println("Press Enter to roll the dice.");

            input.nextLine();

            int dice = random.nextInt(6) + 1;

            System.out.println("Player " + player + " rolled: " + dice);

            // If dice is 6, bring Token 1 out
            if (dice == 6) {

                if (player == 1) {
                    player1Token1 = 1;
                } else {
                    player2Token1 = 1;
                }
            }

            // Display Player 1 tokens
            System.out.println("Player 1 Token 1: " + player1Token1);
            System.out.println("Player 1 Token 2: " + player1Token2);
            System.out.println("Player 1 Token 3: " + player1Token3);
            System.out.println("Player 1 Token 4: " + player1Token4);

            // Display Player 2 tokens
            System.out.println("Player 2 Token 1: " + player2Token1);
            System.out.println("Player 2 Token 2: " + player2Token2);
            System.out.println("Player 2 Token 3: " + player2Token3);
            System.out.println("Player 2 Token 4: " + player2Token4);

            // Change player
            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
        }
    }
}