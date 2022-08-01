package pasur;

import ch.aplu.jcardgame.Card;

import java.util.ArrayList;

public class PickedCardsScoringStrategy extends ScoringStrategy{

    /**
     *
     * @param player calculates score of the player from picked Cards
     * @return
     */
    public int[] getScore(Player player) {
        ArrayList<Card> cards = player.getPickedCards().getCardList();
        return super.calculateScore(cards);

    }
}
