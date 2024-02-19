package com.meshalkin;

public class Simulation {

    final static String ANSI_EARTH_BACKGROUND = "\u001B[48;5;136m"; // Серо-коричневый
    final static String ANSI_RESET = "\u001B[0m"; // сброс настроек

    //идет по вертикали
    public void render(Map map){
        for (int i = 8; i >= 1 ; i--) {
            String line = ANSI_EARTH_BACKGROUND; // устанавливаем серо-коричневый фон для строки
            for(File file: File.values()){
                line += getEntitySprite(map, new Coordinates(file, i));
            }
            line += ANSI_RESET; // сбрасываем настройки после окончания строки
            System.out.println(line);
        }
    }

    //нужен метод который бы отоброжал сущности
    public String getEntitySprite(Map map, Coordinates coordinates){
        if(map.isSquareEmpty(coordinates)){
            return " ";
        }else{
            Entity entity = map.getEntity(coordinates);
            return entity.getSymbol();
        }
    }
}
