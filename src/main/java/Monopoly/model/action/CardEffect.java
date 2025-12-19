package Monopoly.model.action;

import Monopoly.model.GameState;
import Monopoly.model.card.Card;

public class CardEffect extends Action {
    Card card;
    public CardEffect(int actionID, int actorID, Card card) {
        super(actionID, actorID);
        this.card = card;
    }

    @Override
    public void act(GameState state) {
        //todo
    }

    @Override
    public void undo(GameState state) {
        //todo
    }
}
