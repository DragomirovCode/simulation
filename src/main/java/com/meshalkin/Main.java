package com.meshalkin;

import com.meshalkin.entities.Herbivore;
import com.meshalkin.entities.Predator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mapping mapping = new Mapping();

        Coordinates start = new Coordinates(File.A, 1);
        Coordinates end = new Coordinates(File.G, 2);

        Creature creature = new Predator(start);

        boolean result = creature.searchForAHerbivore(mapping, start, end);

        if (result) {
            System.out.println("Травоядное существо найдено на позиции " + end);
        } else {
            System.out.println("Травоядное существо не найдено на позиции " + end);
        }
    }
}
