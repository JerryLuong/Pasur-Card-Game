package pasur;

import ch.aplu.jcardgame.Card;

import java.util.ArrayList;

public abstract class ScoringStrategy {
    /**
     *
     * @param cards calculates total scores based on provided set of cards
     * @return
     */
    protected int[] calculateScore(ArrayList<Card> cards){
        int[] result = new int[2];
        int score = 0, clubCount = 0;
        if(cards.size()==0){
            result[0] = 0;
            result[1] = 0;
            return result;
        }

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            if (card.getRank() == Rank.TEN && card.getSuit() == Suit.DIAMONDS) {
                score += 3;
            }
            if (card.getRank() == Rank.TWO && card.getSuit() == Suit.CLUBS) {
                score += 2;
            }
            if (card.getSuit() == Suit.CLUBS) {
                clubCount++;
            }
            if (card.getRank() == Rank.ACE || card.getRank() == Rank.JACK) {
                score += 1;
            }
        }
        result[0] = score;
        result[1] = clubCount;
        return result;
    }
    public abstract int[] getScore(Player p);


}
