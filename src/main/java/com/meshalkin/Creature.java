package com.meshalkin;

abstract public class Creature extends Entity {
    public Creature(Coordinates coordinates, String color) {
        super(coordinates, color);
    }

    void makeMove() {}
}
