package com.meshalkin.piece;

import com.meshalkin.Coordinates;
import com.meshalkin.CoordinatesShit;
import com.meshalkin.Creature;
import com.meshalkin.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Creature {

    public Herbivore(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    protected Set<CoordinatesShit> getEntityMoves() {
        return new HashSet<>(Arrays.asList(
                new CoordinatesShit(1,1)));
    }


    @Override
    public String getSymbol() {
        return "\uD83D\uDC07";
    }
}
