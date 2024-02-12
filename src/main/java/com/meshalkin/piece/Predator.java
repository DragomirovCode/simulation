package com.meshalkin.piece;

import com.meshalkin.Coordinates;
import com.meshalkin.Creature;

public class Predator extends Creature {

    public Predator(Coordinates coordinates, String color) {
        super(coordinates, color);
    }

    @Override
    public char getSymbol() {
        return 'P';
    }
}
