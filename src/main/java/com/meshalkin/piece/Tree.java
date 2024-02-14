package com.meshalkin.piece;

import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Tree extends Entity {

    public Tree(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public String getSymbol() {
        return "\uD83C\uDF32";
    }

    @Override
    public String getColorSymbol() {
        return null;
    }
}
