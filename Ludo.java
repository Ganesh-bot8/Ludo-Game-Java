import java.util.Random;
import java.util.Scanner;

public class Ludo {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int player = 1;

        System.out.println("Welcome to Ludo Game!");

        while (true) {

            System.out.println("Player " + player + " turn");
            System.out.println("Press Enter to roll the dice.");

            input.nextLine();

            int dice = random.nextInt(6) + 1;

            System.out.println("Player " + player + " rolled: " + dice);

            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
        }
    }
}