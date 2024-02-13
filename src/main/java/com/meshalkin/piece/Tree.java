package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Tree extends Entity {

    public Tree(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public char getSymbol() {
        return 'T';
    }

    @Override
    public String getColorSymbol() {
        return null;
    }
}
