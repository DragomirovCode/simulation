package com.meshalkin;

public class Simulation {

    final static String ANSI_EARTH_BACKGROUND = "\u001B[48;5;136m"; // Серо-коричневый
    final static String ANSI_RESET = "\u001B[0m"; // сброс настроек

    //идет по вертикали
    public void render(Mapping mapping){
        for (int i = 8; i >= 1 ; i--) {
            String line = ANSI_EARTH_BACKGROUND; // устанавливаем серо-коричневый фон для строки
            for(File file: File.values()){
                line += getEntitySprite(mapping, new Coordinates(file, i));
            }
            line += ANSI_RESET; // сбрасываем настройки после окончания строки
            System.out.println(line);
        }
    }

    //нужен метод который бы отоброжал сущности
    public String getEntitySprite(Mapping mapping, Coordinates coordinates){
        if(mapping.isSquareEmpty(coordinates)){
            return " ";
        }else{
            Entity entity = mapping.getEntity(coordinates);
            return entity.getSymbol();
        }
    }
}
