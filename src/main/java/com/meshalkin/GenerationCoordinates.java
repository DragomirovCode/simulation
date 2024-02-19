package com.meshalkin;

import com.meshalkin.entities.Predator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationCoordinates {

    private List<Creature> creatures;

    private Random random = new Random();

    private File[] files = File.values();

    public GenerationCoordinates(List<Creature> creatures) {
        this.creatures = creatures;
    }

    public Coordinates generation(){
        // Выбираем случайное существо
        int index = random.nextInt(creatures.size());
        Creature creature = creatures.get(index);

        // Генерируем новые координаты
        File x = files[random.nextInt(files.length)];
        int y = random.nextInt(8) + 1; // добавляем 1, чтобы получить числа от 1 до 8

        // Передаем новые координаты существу
        return new Coordinates(x,y);
    }
}
