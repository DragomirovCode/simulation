package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Creature;

public class Predator extends Creature {

    public Predator(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public char getSymbol() {
        return 'P';
    }

    @Override
    public String getColorSymbol() {
        return Color.RED;
    }
}
