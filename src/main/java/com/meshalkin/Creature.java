package com.meshalkin;

import java.util.*;

abstract public class Creature extends Entity {
    public Creature(Coordinates coordinates) {
        super(coordinates);
    }

    public Set<Coordinates> getAvailableToMove(Mapping mapping){
        Set<Coordinates> result = new HashSet<>();

        for (CoordinatesShift shit : getEntityMoves()) {
            if(coordinates.canShift(shit)){
                Coordinates newCoordinates = coordinates.shift(shit);

                if(isTheCellAvailableForAMoves(newCoordinates, mapping)){
                    result.add(newCoordinates);
                }
            }
        }
        return result;
    }
    public Map<Coordinates, Coordinates> searchPath(Mapping mapping, Coordinates start, Coordinates end){
        Queue<Coordinates> queue = new LinkedList<>();
        Set<Coordinates> visited = new HashSet<>();
        Map<Coordinates, Coordinates> previous = new HashMap<>(); // Для хранения информации о предыдущих вершинах
        queue.add(start);
        visited.add(start);
        while(!queue.isEmpty()){
            Coordinates current = queue.remove();
            if(current.equals(end)){
                return previous;
            }
            for(CoordinatesShift shift: getEntityMoves()){
                Coordinates next = current.shift(shift);
                if(next.canShift(shift) && !visited.contains(next) && mapping.isSquareEmpty(next)){
                    queue.add(next);
                    visited.add(next);
                    previous.put(next, current); // Сохраняем информацию о предыдущей вершине для текущей вершины
                }
            }
        }
        return previous;
    }

    private boolean isTheCellAvailableForAMoves(Coordinates coordinates, Mapping mapping) {
        return mapping.isSquareEmpty(coordinates);
    }

    public abstract Set<CoordinatesShift> getEntityMoves();

    public List<Coordinates> getPathToTarget(Coordinates start, Coordinates target, Map<Coordinates, Coordinates> previous) {
        List<Coordinates> path = new ArrayList<>();
        Coordinates current = target;

        while (current != null && !current.equals(start)) {
            path.add(current);
            current = previous.get(current);
        }

        if (current == null) {
            // Путь не найден, возможно, что предыдущие координаты содержат null
            System.out.println("Путь не найден");
            return null; // или можно вернуть пустой список path, в зависимости от логики вашего приложения
        }

        // Путь найден, переворачиваем список, чтобы он начинался с начальной точки
        Collections.reverse(path);
        return path;
    }

}
