package com.meshalkin;

import java.util.HashSet;
import java.util.Set;

abstract public class Creature extends Entity {
    public Creature(Coordinates coordinates) {
        super(coordinates);
    }

    public Set<Coordinates> getAvailableToMove(Map map){
        Set<Coordinates> result = new HashSet<>();

        for (CoordinatesShift shit : getEntityMoves()) {
            if(coordinates.canShift(shit)){
                Coordinates newCoordinates = coordinates.shift(shit);

                if(isTheCellAvailableForAMoves(newCoordinates, map)){
                    result.add(newCoordinates);
                }
            }
        }
        return result;
    }

    private boolean isTheCellAvailableForAMoves(Coordinates coordinates, Map map) {
        return map.isSquareEmpty(coordinates);
    }

    protected abstract Set<CoordinatesShift> getEntityMoves();
}
