import java.util.Random;
import java.util.Scanner;

public class Ludo {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int player = 1;
        int finishPosition = 52;

        int player1Token1 = 0;
        int player1Token2 = 0;
        int player1Token3 = 0;
        int player1Token4 = 0;

        int player2Token1 = 0;
        int player2Token2 = 0;
        int player2Token3 = 0;
        int player2Token4 = 0;

        int player3Token1 = 0;
        int player3Token2 = 0;
        int player3Token3 = 0;
        int player3Token4 = 0;

        System.out.println("Welcome to Ludo Game!");

        while (true) {

            System.out.println();
            System.out.println("Player " + player + " turn");
            System.out.println("Press Enter to roll the dice.");

            input.nextLine();

            int dice = random.nextInt(6) + 1;

            System.out.println("Player " + player + " rolled: " + dice);

            System.out.println("Choose a token:");
            System.out.println("1. Token 1");
            System.out.println("2. Token 2");
            System.out.println("3. Token 3");
            System.out.println("4. Token 4");

            int choice = input.nextInt();
            input.nextLine();

            boolean moved = false;

            if (player == 1) {

                if (choice == 1) {

                    if (player1Token1 == 0 && dice == 6) {
                        player1Token1 = 1;
                        moved = true;
                    } else if (player1Token1 > 0) {

                        if (player1Token1 + dice <= finishPosition) {
                            player1Token1 = player1Token1 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player1Token1 < finishPosition &&
                        player1Token1 != 5 &&
                        player1Token1 != 12 &&
                        player1Token1 != 17 &&
                        player1Token1 != 23 &&
                        player1Token1 != 29 &&
                        player1Token1 != 34 &&
                        player1Token1 != 40 &&
                        player1Token1 != 46) {

                        if (player1Token1 == player2Token1 && player2Token1 > 0) {
                            player2Token1 = 0;
                            System.out.println("Player 1 killed Player 2 Token 1!");
                        } else if (player1Token1 == player2Token2 && player2Token2 > 0) {
                            player2Token2 = 0;
                            System.out.println("Player 1 killed Player 2 Token 2!");
                        } else if (player1Token1 == player2Token3 && player2Token3 > 0) {
                            player2Token3 = 0;
                            System.out.println("Player 1 killed Player 2 Token 3!");
                        } else if (player1Token1 == player2Token4 && player2Token4 > 0) {
                            player2Token4 = 0;
                            System.out.println("Player 1 killed Player 2 Token 4!");
                        } else if (player1Token1 == player3Token1 && player3Token1 > 0) {
                            player3Token1 = 0;
                            System.out.println("Player 1 killed Player 3 Token 1!");
                        } else if (player1Token1 == player3Token2 && player3Token2 > 0) {
                            player3Token2 = 0;
                            System.out.println("Player 1 killed Player 3 Token 2!");
                        } else if (player1Token1 == player3Token3 && player3Token3 > 0) {
                            player3Token3 = 0;
                            System.out.println("Player 1 killed Player 3 Token 3!");
                        } else if (player1Token1 == player3Token4 && player3Token4 > 0) {
                            player3Token4 = 0;
                            System.out.println("Player 1 killed Player 3 Token 4!");
                        }
                    }

                } else if (choice == 2) {

                    if (player1Token2 == 0 && dice == 6) {
                        player1Token2 = 1;
                        moved = true;
                    } else if (player1Token2 > 0) {

                        if (player1Token2 + dice <= finishPosition) {
                            player1Token2 = player1Token2 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player1Token2 < finishPosition &&
                        player1Token2 != 5 &&
                        player1Token2 != 12 &&
                        player1Token2 != 17 &&
                        player1Token2 != 23 &&
                        player1Token2 != 29 &&
                        player1Token2 != 34 &&
                        player1Token2 != 40 &&
                        player1Token2 != 46) {

                        if (player1Token2 == player2Token1 && player2Token1 > 0) {
                            player2Token1 = 0;
                            System.out.println("Player 1 killed Player 2 Token 1!");
                        } else if (player1Token2 == player2Token2 && player2Token2 > 0) {
                            player2Token2 = 0;
                            System.out.println("Player 1 killed Player 2 Token 2!");
                        } else if (player1Token2 == player2Token3 && player2Token3 > 0) {
                            player2Token3 = 0;
                            System.out.println("Player 1 killed Player 2 Token 3!");
                        } else if (player1Token2 == player2Token4 && player2Token4 > 0) {
                            player2Token4 = 0;
                            System.out.println("Player 1 killed Player 2 Token 4!");
                        } else if (player1Token2 == player3Token1 && player3Token1 > 0) {
                            player3Token1 = 0;
                            System.out.println("Player 1 killed Player 3 Token 1!");
                        } else if (player1Token2 == player3Token2 && player3Token2 > 0) {
                            player3Token2 = 0;
                            System.out.println("Player 1 killed Player 3 Token 2!");
                        } else if (player1Token2 == player3Token3 && player3Token3 > 0) {
                            player3Token3 = 0;
                            System.out.println("Player 1 killed Player 3 Token 3!");
                        } else if (player1Token2 == player3Token4 && player3Token4 > 0) {
                            player3Token4 = 0;
                            System.out.println("Player 1 killed Player 3 Token 4!");
                        }
                    }

                } else if (choice == 3) {

                    if (player1Token3 == 0 && dice == 6) {
                        player1Token3 = 1;
                        moved = true;
                    } else if (player1Token3 > 0) {

                        if (player1Token3 + dice <= finishPosition) {
                            player1Token3 = player1Token3 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player1Token3 < finishPosition &&
                        player1Token3 != 5 &&
                        player1Token3 != 12 &&
                        player1Token3 != 17 &&
                        player1Token3 != 23 &&
                        player1Token3 != 29 &&
                        player1Token3 != 34 &&
                        player1Token3 != 40 &&
                        player1Token3 != 46) {

                        if (player1Token3 == player2Token1 && player2Token1 > 0) {
                            player2Token1 = 0;
                            System.out.println("Player 1 killed Player 2 Token 1!");
                        } else if (player1Token3 == player2Token2 && player2Token2 > 0) {
                            player2Token2 = 0;
                            System.out.println("Player 1 killed Player 2 Token 2!");
                        } else if (player1Token3 == player2Token3 && player2Token3 > 0) {
                            player2Token3 = 0;
                            System.out.println("Player 1 killed Player 2 Token 3!");
                        } else if (player1Token3 == player2Token4 && player2Token4 > 0) {
                            player2Token4 = 0;
                            System.out.println("Player 1 killed Player 2 Token 4!");
                        } else if (player1Token3 == player3Token1 && player3Token1 > 0) {
                            player3Token1 = 0;
                            System.out.println("Player 1 killed Player 3 Token 1!");
                        } else if (player1Token3 == player3Token2 && player3Token2 > 0) {
                            player3Token2 = 0;
                            System.out.println("Player 1 killed Player 3 Token 2!");
                        } else if (player1Token3 == player3Token3 && player3Token3 > 0) {
                            player3Token3 = 0;
                            System.out.println("Player 1 killed Player 3 Token 3!");
                        } else if (player1Token3 == player3Token4 && player3Token4 > 0) {
                            player3Token4 = 0;
                            System.out.println("Player 1 killed Player 3 Token 4!");
                        }
                    }

                } else if (choice == 4) {

                    if (player1Token4 == 0 && dice == 6) {
                        player1Token4 = 1;
                        moved = true;
                    } else if (player1Token4 > 0) {

                        if (player1Token4 + dice <= finishPosition) {
                            player1Token4 = player1Token4 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player1Token4 < finishPosition &&
                        player1Token4 != 5 &&
                        player1Token4 != 12 &&
                        player1Token4 != 17 &&
                        player1Token4 != 23 &&
                        player1Token4 != 29 &&
                        player1Token4 != 34 &&
                        player1Token4 != 40 &&
                        player1Token4 != 46) {

                        if (player1Token4 == player2Token1 && player2Token1 > 0) {
                            player2Token1 = 0;
                            System.out.println("Player 1 killed Player 2 Token 1!");
                        } else if (player1Token4 == player2Token2 && player2Token2 > 0) {
                            player2Token2 = 0;
                            System.out.println("Player 1 killed Player 2 Token 2!");
                        } else if (player1Token4 == player2Token3 && player2Token3 > 0) {
                            player2Token3 = 0;
                            System.out.println("Player 1 killed Player 2 Token 3!");
                        } else if (player1Token4 == player2Token4 && player2Token4 > 0) {
                            player2Token4 = 0;
                            System.out.println("Player 1 killed Player 2 Token 4!");
                        } else if (player1Token4 == player3Token1 && player3Token1 > 0) {
                            player3Token1 = 0;
                            System.out.println("Player 1 killed Player 3 Token 1!");
                        } else if (player1Token4 == player3Token2 && player3Token2 > 0) {
                            player3Token2 = 0;
                            System.out.println("Player 1 killed Player 3 Token 2!");
                        } else if (player1Token4 == player3Token3 && player3Token3 > 0) {
                            player3Token3 = 0;
                            System.out.println("Player 1 killed Player 3 Token 3!");
                        } else if (player1Token4 == player3Token4 && player3Token4 > 0) {
                            player3Token4 = 0;
                            System.out.println("Player 1 killed Player 3 Token 4!");
                        }
                    }
                }

            } else if (player == 2) {

                if (choice == 1) {

                    if (player2Token1 == 0 && dice == 6) {
                        player2Token1 = 1;
                        moved = true;
                    } else if (player2Token1 > 0) {

                        if (player2Token1 + dice <= finishPosition) {
                            player2Token1 = player2Token1 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player2Token1 < finishPosition &&
                        player2Token1 != 5 &&
                        player2Token1 != 12 &&
                        player2Token1 != 17 &&
                        player2Token1 != 23 &&
                        player2Token1 != 29 &&
                        player2Token1 != 34 &&
                        player2Token1 != 40 &&
                        player2Token1 != 46) {

                        if (player2Token1 == player1Token1 && player1Token1 > 0) {
                            player1Token1 = 0;
                            System.out.println("Player 2 killed Player 1 Token 1!");
                        } else if (player2Token1 == player1Token2 && player1Token2 > 0) {
                            player1Token2 = 0;
                            System.out.println("Player 2 killed Player 1 Token 2!");
                        } else if (player2Token1 == player1Token3 && player1Token3 > 0) {
                            player1Token3 = 0;
                            System.out.println("Player 2 killed Player 1 Token 3!");
                        } else if (player2Token1 == player1Token4 && player1Token4 > 0) {
                            player1Token4 = 0;
                            System.out.println("Player 2 killed Player 1 Token 4!");
                        } else if (player2Token1 == player3Token1 && player3Token1 > 0) {
                            player3Token1 = 0;
                            System.out.println("Player 2 killed Player 3 Token 1!");
                        } else if (player2Token1 == player3Token2 && player3Token2 > 0) {
                            player3Token2 = 0;
                            System.out.println("Player 2 killed Player 3 Token 2!");
                        } else if (player2Token1 == player3Token3 && player3Token3 > 0) {
                            player3Token3 = 0;
                            System.out.println("Player 2 killed Player 3 Token 3!");
                        } else if (player2Token1 == player3Token4 && player3Token4 > 0) {
                            player3Token4 = 0;
                            System.out.println("Player 2 killed Player 3 Token 4!");
                        }
                    }

                } else if (choice == 2) {

                    if (player2Token2 == 0 && dice == 6) {
                        player2Token2 = 1;
                        moved = true;
                    } else if (player2Token2 > 0) {

                        if (player2Token2 + dice <= finishPosition) {
                            player2Token2 = player2Token2 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player2Token2 < finishPosition &&
                        player2Token2 != 5 &&
                        player2Token2 != 12 &&
                        player2Token2 != 17 &&
                        player2Token2 != 23 &&
                        player2Token2 != 29 &&
                        player2Token2 != 34 &&
                        player2Token2 != 40 &&
                        player2Token2 != 46) {

                        if (player2Token2 == player1Token1 && player1Token1 > 0) {
                            player1Token1 = 0;
                            System.out.println("Player 2 killed Player 1 Token 1!");
                        } else if (player2Token2 == player1Token2 && player1Token2 > 0) {
                            player1Token2 = 0;
                            System.out.println("Player 2 killed Player 1 Token 2!");
                        } else if (player2Token2 == player1Token3 && player1Token3 > 0) {
                            player1Token3 = 0;
                            System.out.println("Player 2 killed Player 1 Token 3!");
                        } else if (player2Token2 == player1Token4 && player1Token4 > 0) {
                            player1Token4 = 0;
                            System.out.println("Player 2 killed Player 1 Token 4!");
                        } else if (player2Token2 == player3Token1 && player3Token1 > 0) {
                            player3Token1 = 0;
                            System.out.println("Player 2 killed Player 3 Token 1!");
                        } else if (player2Token2 == player3Token2 && player3Token2 > 0) {
                            player3Token2 = 0;
                            System.out.println("Player 2 killed Player 3 Token 2!");
                        } else if (player2Token2 == player3Token3 && player3Token3 > 0) {
                            player3Token3 = 0;
                            System.out.println("Player 2 killed Player 3 Token 3!");
                        } else if (player2Token2 == player3Token4 && player3Token4 > 0) {
                            player3Token4 = 0;
                            System.out.println("Player 2 killed Player 3 Token 4!");
                        }
                    }

                } else if (choice == 3) {

                    if (player2Token3 == 0 && dice == 6) {
                        player2Token3 = 1;
                        moved = true;
                    } else if (player2Token3 > 0) {

                        if (player2Token3 + dice <= finishPosition) {
                            player2Token3 = player2Token3 + dice;
                            moved = true;
                        } else {
                            System.out.println("Cannot move. You need an exact number to reach home.");
                        }

                    } else {
                        System.out.println("This token is not out yet.");
                    }

                    if (moved && player2Token3 < finishP