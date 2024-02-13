package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Rock extends Entity {

    public Rock(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public char getSymbol() {
        return 'R';
    }

    @Override
    public String getColorSymbol() {
        return null;
    }
}
