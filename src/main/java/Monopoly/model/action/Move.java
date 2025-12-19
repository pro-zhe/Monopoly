package Monopoly.model.action;

import Monopoly.model.GameState;
import Monopoly.model.tile.Tile;

public class Move extends Action {
    Tile fromTile;
    Tile toTile;

    public Move(int actionID, int actorID , Tile fromTile, Tile toTile) {
        super(actionID, actorID);
        this.fromTile = fromTile;
        this.toTile = toTile;


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
