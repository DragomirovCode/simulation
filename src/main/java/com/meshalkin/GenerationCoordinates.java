package com.meshalkin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GenerationCoordinates {

    private List<Creature> creatures;

    private Random random = new Random();

    public GenerationCoordinates(List<Creature> creatures) {
        this.creatures = creatures;
    }


    public Coordinates generation(){
        // Выбираем случайное существо
        int index = random.nextInt(creatures.size());
        Creature creature = creatures.get(index);

        // Получаем доступные ходы для данного существа
        Set<CoordinatesShift> availableMoves = creature.getEntityMoves();

        // Выбираем случайный доступный ход
        CoordinatesShift randomMove = getRandomMove(availableMoves);

        // Получаем текущие координаты существа
        Coordinates currentCoordinates = creature.getCoordinates();

        // Получаем новые координаты путем смещения
        File currentFile = currentCoordinates.x;
        File newFile = File.values()[(currentFile.ordinal() + randomMove.x) % File.values().length];
        int newY = currentCoordinates.y + randomMove.y;

        // Передаем новые координаты существу
        return new Coordinates(newFile, newY);
    }
    private CoordinatesShift getRandomMove(Set<CoordinatesShift> availableMoves) {
        List<CoordinatesShift> movesList = new ArrayList<>(availableMoves);
        return movesList.get(random.nextInt(movesList.size()));
    }
}
