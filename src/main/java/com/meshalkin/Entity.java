package com.meshalkin;

abstract public class Entity {
    public Coordinates coordinates;

    public String color;

    public Entity(Coordinates coordinates, String color) {
        this.coordinates = coordinates;
        this.color = color;
    }

    public abstract char getSymbol(); // абстрактный метод для получения символа сущности
}
