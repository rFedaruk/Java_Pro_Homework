public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        GameRules.chooseNumberOfPlayers();
        deck.deckInitialization();
        deck.deckShuffling();
        deck.showPlayersCards();
    }
}
