package com.meshalkin.entities;

import com.meshalkin.*;

import java.util.*;

public class Predator extends Creature implements TargetChooser {

    public Predator(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public Set<CoordinatesShift> getEntityMoves() {
        return new HashSet<>(Arrays.asList(
                new CoordinatesShift(1,0),
                new CoordinatesShift(-1,0),
                new CoordinatesShift(0, -1),
                new CoordinatesShift(0, 1)));
    }

    @Override
    public String getSymbol() {
        return "\uD83E\uDD8A";
    }

    // найти ближайшее существо и вернуть его координаты
    @Override
    public Coordinates chooseTarget(Creature creature, Mapping mapping) {
        Coordinates predatorPosition = creature.getCoordinates();
        Set<Coordinates> herbivorePositions = new HashSet<>();
        // Находим координаты всех травоядных существ на карте
        for(Coordinates coordinates: mapping.entities.keySet() ){
            Entity entity = mapping.getEntity(coordinates);
            if(entity instanceof Herbivore){
                herbivorePositions.add(coordinates);
            }
        }
        // Используем обход в ширину для поиска ближайшего травоядного
        Queue<Coordinates> queue = new LinkedList<>();
        Set<Coordinates> visited = new HashSet<>();
        queue.add(predatorPosition);
        visited.add(predatorPosition);
        while (!queue.isEmpty()){
            Coordinates current = queue.remove();
            if(herbivorePositions.contains(current)){
                return current;
            }
            for(CoordinatesShift shift: creature.getEntityMoves()){
                Coordinates next = current.shift(shift);
                if(next.canShift(shift) && !visited.contains(next) && mapping.isSquareEmpty(next)){
                    queue.add(next);
                    visited.add(next);
                }
            }
        }
        return null;
    }
}
