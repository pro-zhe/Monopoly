package Monopoly.model.action;

import Monopoly.model.GameState;

public abstract class Action {
    int actionID;
    int actorID;
    //<affectedEntities> field must be implemented using a proper data structure
    //<previousState> & <newState> fields must be implemented
    //uncertain of their types (action or game state?>

    public Action(int actionID, int actorID) {
        this.actionID = actionID;
        this.actorID = actorID;
    }

    public abstract void act(GameState state);
    public abstract void undo(GameState state);
}
