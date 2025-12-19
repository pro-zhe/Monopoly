package Monopoly.model.action;

import Monopoly.model.GameState;
import Monopoly.model.tile.Tile;

public class Mortgage extends Action {
    Tile propertyTile;
    public Mortgage(int actionID , int actorID, Tile propertyTile) {
        super(actionID, actorID);
        this.propertyTile = propertyTile;
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
