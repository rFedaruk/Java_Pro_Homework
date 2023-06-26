import java.util.Random;

public class Deck {
    private Rank[] massRanks = Rank.values();
    private Suit[] massSuits = Suit.values();
    final Random random = new Random();
    private String[] deck = new String[GameRules.cardsNumber];

    public String[] deckInitialization() {
        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < Suit.values().length; j++) {
                deck[Suit.values().length * i + j] = massRanks[i] + " " + massSuits[j];
            }
        }
        return deck;
    }

    public String[] deckShuffling() {
        for (int i = 0; i < GameRules.cardsNumber; i++) {
            int card = i + (random.nextInt(GameRules.cardsNumber - i));
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public void showPlayersCards() {
        for (int i = 0; i < GameRules.getPlayers() * GameRules.getPlayerCards(); i++) {
            System.out.println(deck[i]);
            if (i % GameRules.getPlayerCards() == GameRules.getPlayerCards() - 1)
                System.out.println();
        }
    }
}
