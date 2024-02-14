package com.meshalkin.piece;

import com.meshalkin.Color;
import com.meshalkin.Coordinates;
import com.meshalkin.Creature;

public class Predator extends Creature {

    public Predator(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public String getSymbol() {
        return "\uD83E\uDD8A";
    }

    @Override
    public String getColorSymbol() {
        return Color.RED;
    }
}
