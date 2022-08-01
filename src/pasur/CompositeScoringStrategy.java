package pasur;
import java.util.ArrayList;
public class CompositeScoringStrategy extends ScoringStrategy{
    protected ArrayList<ScoringStrategy> strategies = new ArrayList<ScoringStrategy>();

    /**
     *
     * @param strategy add strategy to current strategies
     */
    public void add(ScoringStrategy strategy){
        strategies.add(strategy);
    }

    /**
     *
     * @param strategy Remove a strategy from current strategies
     */
    public void remove(ScoringStrategy strategy){
        strategies.remove(strategy);
    }

    /**
     *
     * @param p calculates score of the player (supplied as the input parameter) via adding scores
     *          of picked cards and sur cards
     * @return
     */
    public int[] getScore(Player p) {
        //the first index of array contains score of cards, the second contains score for clubs
        int[] results = new int[2];
        int totalClubCounts = 0;
        results[1] = 0;
        for(ScoringStrategy s: strategies){
            int[] tmp = s.getScore(p);
            results[0] += tmp[0];
            totalClubCounts += tmp[1];
        }
        if (totalClubCounts >= 7){
            results[1] = 7;
        }
        return results;
    }
}
