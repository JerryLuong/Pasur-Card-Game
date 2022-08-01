package pasur;

/**
 * @author Alireza Ostovar
 * 29/09/2021
 */

import ch.aplu.jcardgame.Card;

public class RandomPlayer extends Player
{
    public RandomPlayer(int id)
    {
        super(id);prevScore = 0;currScore = 0;
        addObserver(new PlayerObserver());
    }

    @Override
    Card selectToPlay()
    {
        return hand.isEmpty() ? null : Pasur.randomCard(hand);
    }
}
