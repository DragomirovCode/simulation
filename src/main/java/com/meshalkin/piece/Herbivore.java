package com.meshalkin.piece;

import com.meshalkin.Coordinates;
import com.meshalkin.Creature;

public class Herbivore extends Creature {

    public Herbivore(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC07";
    }
}
