package com.meshalkin;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

abstract public class Creature extends Entity {
    public Creature(Coordinates coordinates) {
        super(coordinates);
    }

    public Set<Coordinates> getAvailableToMove(Mapping mapping){
        Set<Coordinates> result = new HashSet<>();

        for (CoordinatesShift shit : getEntityMoves()) {
            if(coordinates.canShift(shit)){
                Coordinates newCoordinates = coordinates.shift(shit);

                if(isTheCellAvailableForAMoves(newCoordinates, mapping)){
                    result.add(newCoordinates);
                }
            }
        }
        return result;
    }
    public boolean searchForAHerbivore(Mapping mapping, Coordinates start, Coordinates end){
        Queue<Coordinates> queue = new LinkedList<>();
        Set<Coordinates> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        while(!queue.isEmpty()){
            Coordinates current = queue.remove();
            if(current.equals(end)){
                return true;
            }
            for(CoordinatesShift shift: getEntityMoves()){
                Coordinates next = current.shift(shift);
                if(next.canShift(shift) && !visited.contains(next) && mapping.isSquareEmpty(next)){
                    queue.add(next);
                    visited.add(next);
                }
            }
        }
        return false;
    }

    private boolean isTheCellAvailableForAMoves(Coordinates coordinates, Mapping mapping) {
        return mapping.isSquareEmpty(coordinates);
    }

    protected abstract Set<CoordinatesShift> getEntityMoves();
}
