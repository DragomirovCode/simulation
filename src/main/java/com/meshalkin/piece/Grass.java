package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Grass extends Entity {

    public Grass(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public char getSymbol() {
        return 'G';
    }

    @Override
    public String getColorSymbol() {
        return null;
    }
}
