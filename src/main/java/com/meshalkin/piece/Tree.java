package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Tree extends Entity {

    public Tree(Coordinates coordinates, String color) {
        super(coordinates, color);
    }

    @Override
    public char getSymbol() {
        return 'T';
    }
}
