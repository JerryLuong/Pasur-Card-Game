package pasur;

import java.util.ArrayList;
import ch.aplu.jcardgame.*;
public class SurScoringStrategy extends ScoringStrategy{

    /**
     *
     * @param player calculates score of the player from sur cards
     * @return
     */

    public int[] getScore(Player player){
        ArrayList<Card> surs = player.getSurs().getCardList();
        int[] tmp = super.calculateScore(surs);
        tmp[0] = tmp[0] + 5*surs.size();
        return tmp;
    }
}
