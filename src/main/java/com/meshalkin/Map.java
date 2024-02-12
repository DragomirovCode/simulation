package com.meshalkin;

import com.meshalkin.piece.Predator;

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
            setPiece(new Coordinates(File.A, 2), new Predator(new Coordinates(file, 2), Color.ANSI_GREEN) {
                @Override
                public int hashCode() {
                    return super.hashCode();
                }
            });
        }
    }

    public boolean isSquareEmpty(Coordinates coordinates){
        return !pieces.containsKey(coordinates);
    }

    public Entity getEntity(Coordinates coordinates){
        return pieces.get(coordinates);
    }
}
