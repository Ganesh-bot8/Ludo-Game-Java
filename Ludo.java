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

            // If dice is 6, choose a token to bring out
            if (dice == 6) {

                System.out.println("Choose a token:");
                System.out.println("1. Token 1");
                System.out.println("2. Token 2");
                System.out.println("3. Token 3");
                System.out.println("4. Token 4");

                int choice = input.nextInt();
                input.nextLine();

                if (player == 1) {

                    if (choice == 1) {
                        player1Token1 = 1;
                    } else if (choice == 2) {
                        player1Token2 = 1;
                    } else if (choice == 3) {
                        player1Token3 = 1;
                    } else if (choice == 4) {
                        player1Token4 = 1;
                    }

                } else {

                    if (choice == 1) {
                        player2Token1 = 1;
                    } else if (choice == 2) {
                        player2Token2 = 1;
                    } else if (choice == 3) {
                        player2Token3 = 1;
                    } else if (choice == 4) {
                        player2Token4 = 1;
                    }
                }

            } else {

                // Move a token that is already out
                System.out.println("Choose a token to move:");
                System.out.println("1. Token 1");
                System.out.println("2. Token 2");
                System.out.println("3. Token 3");
                System.out.println("4. Token 4");

                int choice = input.nextInt();
                input.nextLine();

                if (player == 1) {

                    if (choice == 1 && player1Token1 > 0) {
                        player1Token1 = player1Token1 + dice;
                    } else if (choice == 2 && player1Token2 > 0) {
                        player1Token2 = player1Token2 + dice;
                    } else if (choice == 3 && player1Token3 > 0) {
                        player1Token3 = player1Token3 + dice;
                    } else if (choice == 4 && player1Token4 > 0) {
                        player1Token4 = player1Token4 + dice;
                    } else {
                        System.out.println("This token is not out yet.");
                    }

                } else {

                    if (choice == 1 && player2Token1 > 0) {
                        player2Token1 = player2Token1 + dice;
                    } else if (choice == 2 && player2Token2 > 0) {
                        player2Token2 = player2Token2 + dice;
                    } else if (choice == 3 && player2Token3 > 0) {
                        player2Token3 = player2Token3 + dice;
                    } else if (choice == 4 && player2Token4 > 0) {
                        player2Token4 = player2Token4 + dice;
                    } else {
                        System.out.println("This token is not out yet.");
                    }
                }
            }

            // Display Player 1 tokens
            System.out.println();
            System.out.println("Player 1 Token 1: " + player1Token1);
            System.out.println("Player 1 Token 2: " + player1Token2);
            System.out.println("Player 1 Token 3: " + player1Token3);
            System.out.println("Player 1 Token 4: " + player1Token4);

            // Display Player 2 tokens
            System.out.println("Player 2 Token 1: " + player2Token1);
            System.out.println("Player 2 Token 2: " + player2Token2);
            System.out.println("Player 2 Token 3: " + player2Token3);
            System.out.println("Player 2 Token 4: " + player2Token4);

            // Change player only when dice is NOT 6
            if (dice != 6) {

                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }

            } else {
                System.out.println("You rolled a 6! You get another turn.");
            }
        }
    }
}