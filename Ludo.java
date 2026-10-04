import java.util.Random;
import java.util.Scanner;

public class Ludo {
    public static void main(String[] args) {

     Random random = new Random();
     Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Ludo Game!");
        System.out.println("Press Enter to roll the dice.");

        input.nextLine();

        int dice = random.nextInt(6) + 1;

        System.out.println("You rolled: " + dice);
    }
}