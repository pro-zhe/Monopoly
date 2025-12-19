package Monopoly.model.action;

import Monopoly.model.GameState;
import Monopoly.model.tile.Tile;

public class PayRent extends Action {
    Tile tile;
    public PayRent(int actionID, int actorID, Tile tile) {
        super(actionID, actorID);
        this.tile = tile;
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
