package com.meshalkin;

abstract public class Entity {
    public Coordinates coordinates;
    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public abstract String getSymbol(); // абстрактный метод для получения символа сущности

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
