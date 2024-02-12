package com.meshalkin.piece;

import com.meshalkin.Coordinates;
import com.meshalkin.Creature;

public class Herbivore extends Creature {

    public Herbivore(Coordinates coordinates, String color) {
        super(coordinates, color);
    }

    @Override
    public char getSymbol() {
        return 'H';
    }
}
