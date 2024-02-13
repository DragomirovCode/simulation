package com.meshalkin;

abstract public class Entity {
    public Coordinates coordinates;



    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
        new Color();
    }

    public abstract char getSymbol(); // абстрактный метод для получения символа сущности

    public abstract String getColorSymbol();
}
