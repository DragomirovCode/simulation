package com.meshalkin;

import com.meshalkin.entities.Predator;

import static com.meshalkin.Actions.initActions;

public class Main {
    public static void main(String[] args) {



        // Создаем объекты для тестирования
        Mapping mapping = new Mapping();
        Predator predator = new Predator(new Coordinates(File.A, 1)); // Предположим, что хищник начинает с позиции 0,0
        Actions actions = new Actions(predator);

        // Запускаем игровой процесс
        Coordinates initialCoordinates = predator.getCoordinates();
        actions.turnActions(initialCoordinates, predator, mapping);
    }
}
