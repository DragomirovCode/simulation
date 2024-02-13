package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Creature;

public class Herbivore extends Creature {

    public Herbivore(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public char getSymbol() {
        return 'H';
    }

    @Override
    public String getColorSymbol() {
        return null;
    }
}
