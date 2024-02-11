package com.meshalkin;

import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> pieces = new HashMap<>();

    public void setPiece(Coordinates coordinates, Entity entity){
        entity.coordinates = coordinates;
        pieces.put(coordinates, entity);
    }
    public void setupPiecesPositions(){
        for(File file: File.values()){
            setPiece(new Coordinates(file, 2), new Entity(new Coordinates(file, 2)) {
                @Override
                public int hashCode() {
                    return super.hashCode();
                }
            });
        }
    }
}
