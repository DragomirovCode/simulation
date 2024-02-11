package com.meshalkin;

public class Simulation {

    final static String ANSI_ORANGE_BACKGROUND = "\u001B[48;5;208m";
    final static String ANSI_RESET = "\u001B[0m"; // сброс настроек


    public void render(Map map){
        for (int horizon = 8; horizon >= 1 ; horizon--) {
            String line = ANSI_ORANGE_BACKGROUND; // устанавливаем оранжевый фон для строки
            for(File file: File.values()){
                line += " "; // добавляем пробел для каждой ячейки
            }
            line += ANSI_RESET; // сбрасываем настройки после окончания строки
            System.out.println(line);
        }
    }
}
