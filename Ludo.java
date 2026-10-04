import java.util.Random;
import java.util.Scanner;

public class Ludo {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int player = 1;

        int token1 = 0;
        int token2 = 0;
        int token3 = 0;
        int token4 = 0;

        System.out.println("Welcome to Ludo Game!");

        while (true) {

            System.out.println("Player " + player + " turn");
            System.out.println("Press Enter to roll the dice.");

            input.nextLine();

            int dice = random.nextInt(6) + 1;

            System.out.println("Player " + player + " rolled: " + dice);

System.out.println("Token 1: " + token1);
System.out.println("Token 2: " + token2);
System.out.println("Token 3: " + token3);
System.out.println("Token 4: " + token4);

            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
        }
    }
}