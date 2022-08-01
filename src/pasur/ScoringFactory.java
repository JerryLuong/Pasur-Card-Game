package pasur;

public class ScoringFactory {
    /**
     * the Scoring factory object
     */
    public static ScoringFactory instance;

    /**
     * @return returns the instance of scoring factory
     */
    public static synchronized ScoringFactory getInstance() {
        if (instance == null )
            instance = new ScoringFactory();
        return instance;
    }

    /**
     * @return Composite strategy for calculating scores by adding scores
     * of sur and non sur cards
     */
    public CompositeScoringStrategy getCompositeScoringStrategy(){

        CompositeScoringStrategy cs = new CompositeScoringStrategy();
        cs.add(new PickedCardsScoringStrategy());
        cs.add(new SurScoringStrategy());

        return cs;
    }
}
