package com.meshalkin;

abstract public class Entity {
    public Coordinates coordinates;
    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public abstract String getSymbol(); // абстрактный метод для получения символа сущности
}
