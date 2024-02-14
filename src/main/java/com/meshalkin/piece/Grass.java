package com.meshalkin.piece;

import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Grass extends Entity {

    public Grass(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public String getSymbol() {
        return "\uD83C\uDF3F";
    }
}
