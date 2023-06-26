import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class GameRules {
    final static int playerCards  = 5;
    final static int cardsNumber = Rank.values().length * Suit.values().length;
    static final Scanner sc = new Scanner(System.in);
    private static int players;



    public static int chooseNumberOfPlayers(){
        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (playerCards * players <= cardsNumber) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
        return players;
    }

    public static int getPlayers() {
        return players;
    }

    public static int getPlayerCards() {
        return playerCards;
    }
}
