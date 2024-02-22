package com.meshalkin;

public class Main {
    public static void main(String[] args) {
        Mapping mapping = new Mapping();
        mapping.setupPiecesPositions();

        Simulation simulation = new Simulation();
        simulation.render(mapping);
    }
}
