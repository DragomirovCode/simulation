package com.meshalkin;

import com.meshalkin.entities.*;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    HashMap<Coordinates, Entity> entities = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity){
        entity.coordinates = coordinates;
        entities.put(coordinates, entity);
    }
    public void removeEntity(Coordinates coordinates){
        entities.remove(coordinates);
    }
    public void moveEntity(Coordinates from, Coordinates to){
        Entity entity = getEntity(from);
        removeEntity(from);
        setEntity(to, entity);
    }

    // идёт по горизонтали
    public void setupPiecesPositions(){
        for(File file: File.values()){
            setEntity(new Coordinates(File.A, 2), new Predator(new Coordinates(file, 2)));
            setEntity(new Coordinates(File.G,6), new Tree(new Coordinates(file, 6)));
            setEntity(new Coordinates(File.B,3), new Grass(new Coordinates(file, 3)));
            setEntity(new Coordinates(File.E,5), new Herbivore(new Coordinates(file, 5)));
            setEntity(new Coordinates(File.B,4), new Rock(new Coordinates(file, 4)));
        }
    }

    public boolean isSquareEmpty(Coordinates coordinates){
        return !entities.containsKey(coordinates);
    }

    public Entity getEntity(Coordinates coordinates){
        return entities.get(coordinates);
    }
}
