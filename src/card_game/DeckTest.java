package card_game;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Deck.Card c = d.pick();
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}
