package Chapter2.Card;


public class Card {
    private int cardRank;
    private int cardSuit;
    public static final int MAX_RANK = 13;
    public static final int MIN_RANK = 1;
    public static final int MAX_SUIT = 4;
    public static final int MIN_SUIT = 1;

    public Card() {
        cardRank = 1;
        cardSuit = 4;
    }

    public void setRank(int rank) {
        if (rank <= MAX_RANK && rank >= MIN_RANK) {
            cardRank = rank;
        } else {
            throw new IllegalArgumentException("Only accepts numbers between 1 and 13. 1 for Ace, 11 for Jack, 12 for Queen, and 13 for King.");
        }
    }
    public void setSuit(int suit) {
        if (suit <= MAX_RANK && suit >= MIN_RANK) {
            cardSuit = suit;
        } else {
            throw new IllegalArgumentException("Only accepts numbers between 1 and 4. 1 for clubs, 2 for diamonds, 3 for hearts, and 4 for spades");
        }
    }

    public String getRank() {
        if (cardRank == 1) {
            return "Ace";
        } else if (cardRank == 11) {
            return "Jack";
        } else if (cardRank == 12) {
            return "Queen";
        } else if (cardRank == 13) {
            return "King";
        } else {
            return Integer.toString(cardRank);
        }
    }
    public String getSuit() {
        if (cardSuit == 1) {
            return "Clubs";
        } else if (cardSuit == 2) {
            return "Diamonds";
        } else if (cardSuit == 3) {
            return "Hearts";
        } else {
            return "Spades";
        }
    }
}
