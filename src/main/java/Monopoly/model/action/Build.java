package Monopoly.model.action;

import Monopoly.model.GameState;
import Monopoly.model.tile.Tile;

public class Build extends Action {
    Tile overTile;

    public Build(int actionID, int actorID, Tile overTile) {
        super(actionID, actorID);
        this.overTile = overTile;
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
