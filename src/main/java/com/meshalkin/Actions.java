package com.meshalkin;

public class Actions {

    private static Mapping mapping = new Mapping();

    private static Simulation simulation = new Simulation();

    public static void initActions(){
        mapping.setupPiecesPositions();
        simulation.render(mapping);
    }
}
