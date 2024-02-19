package com.meshalkin.entities;

import com.meshalkin.Coordinates;
import com.meshalkin.Entity;

public class Rock extends Entity {

    public Rock(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public String getSymbol() {
        return "⛰️";
    }
}
