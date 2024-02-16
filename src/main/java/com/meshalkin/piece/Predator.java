package com.meshalkin.piece;

import com.meshalkin.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Predator extends Creature {

    public Predator(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    protected Set<CoordinatesShit> getEntityMoves() {
        return new HashSet<>(Arrays.asList(
                new CoordinatesShit(1,1)));
    }

    @Override
    public String getSymbol() {
        return "\uD83E\uDD8A";
    }
}
