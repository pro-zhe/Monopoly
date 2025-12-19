package Monopoly.model;

import Monopoly.model.Enums.PlayerStatus;
import Monopoly.model.data_structures.Stack;
import Monopoly.model.tile.PropertyTile;

import java.util.ArrayList;

public class Player {
    int playerID;
    String name;
    int balance;
    //currentPosition must be added as a field
    private PlayerStatus status;
    int jailTurns;
    ArrayList<PropertyTile> ownedProperties;
    Stack actionHistory;
}
