package com.meshalkin;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Actions {

    private static Mapping mapping = new Mapping();

    private static Simulation simulation = new Simulation();

    private TargetChooser targetChooser;

    public Actions(TargetChooser targetChooser) {
        this.targetChooser = targetChooser;
    }


    public static void initActions(){
        mapping.setupPiecesPositions();
        simulation.render(mapping);
    }
    public void turnActions(Coordinates coordinates, Creature creature, Mapping mapping) {
        initActions();
        Coordinates target = targetChooser.chooseTarget(creature, mapping);
        if (target != null) {
            System.out.println("Ближайшее травоядное существо найдено на координатах: " + target);
        } else {
            System.out.println("Ближайшее травоядное существо не найдено.");
        }
        Set<Coordinates> availableMoves = creature.getAvailableToMove(mapping);

        if (!availableMoves.isEmpty()) {
            // Поиск пути к цели
            Map<Coordinates, Coordinates> previous = creature.searchPath(mapping, coordinates, target);

            // Если путь найден
            if (!previous.isEmpty()) {
                // Получаем путь к цели
                List<Coordinates> pathToTarget = creature.getPathToTarget(coordinates, target, previous);

                // Перемещаемся по пути к цели
                for (Coordinates nextMove : pathToTarget) {
                    // Перемещаем фигуру
                    mapping.moveEntity(coordinates, nextMove);

                    // Обновляем координаты
                    coordinates = nextMove;

                    // Рендерим карту
                    simulation.render(mapping);
                }
            }
        }
    }
}
