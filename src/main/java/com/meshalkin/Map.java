package com.meshalkin;

import com.meshalkin.piece.*;

import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> pieces = new HashMap<>();

    public void setPiece(Coordinates coordinates, Entity entity){
        entity.coordinates = coordinates;
        pieces.put(coordinates, entity);
    }

    // идёт по горизонтали
    public void setupPiecesPositions(){
        for(File file: File.values()){
            setPiece(new Coordinates(File.A, 2), new Predator(new Coordinates(file, 2)));
            setPiece(new Coordinates(File.G,6), new Tree(new Coordinates(file, 6)));
            setPiece(new Coordinates(File.B,3), new Grass(new Coordinates(file, 3)));
            setPiece(new Coordinates(File.E,5), new Herbivore(new Coordinates(file, 5)));
            setPiece(new Coordinates(File.B,4), new Rock(new Coordinates(file, 4)));
        }
    }

    public boolean isSquareEmpty(Coordinates coordinates){
        return !pieces.containsKey(coordinates);
    }

    public Entity getEntity(Coordinates coordinates){
        return pieces.get(coordinates);
    }
}
