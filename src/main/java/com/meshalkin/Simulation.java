package com.meshalkin;

public class Simulation {

    final static String ANSI_ORANGE_BACKGROUND = "\u001B[48;5;208m";
    final static String ANSI_RESET = "\u001B[0m"; // сброс настроек

    //идет по вертикали
    public void render(Map map){
        for (int i = 8; i >= 1 ; i--) {
            String line = ANSI_ORANGE_BACKGROUND; // устанавливаем оранжевый фон для строки
            for(File file: File.values()){
                line += getPiecesSprite(map, new Coordinates(file, i));
            }
            line += ANSI_RESET; // сбрасываем настройки после окончания строки
            System.out.println(line);
        }
    }

    //нужен метод который бы отоброжал сущности
    public String getPiecesSprite(Map map, Coordinates coordinates){
        if(map.isSquareEmpty(coordinates)){
            return " ";
        }else{
            Entity entity = map.getEntity(coordinates);
            return String.valueOf(entity.getSymbol());
        }
    }
}
