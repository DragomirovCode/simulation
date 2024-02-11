package com.meshalkin;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.setupPiecesPositions();

        Simulation simulation = new Simulation();
        simulation.render(map);
    }
}
