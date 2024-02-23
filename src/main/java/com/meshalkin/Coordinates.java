package com.meshalkin;
import java.util.Objects;

public class Coordinates {
    public File x; // вертикаль
    public Integer y; // горизонталь

    public Coordinates(File x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public Coordinates shift(CoordinatesShift shift) {
        int newX = this.x.ordinal() + shift.x;
        int newY = this.y + shift.y;
        if (canShift(shift)) {
            return new Coordinates(File.values()[newX], newY);
        } else {
            // Возвращаем текущие координаты, так как смещение недопустимо
            return this;
        }
    }

    public boolean canShift(CoordinatesShift shift){
        int file = x.ordinal() + shift.x;
        int rank = y + shift.y;
        // Проверяем, что новые координаты находятся в диапазоне от 0 до 7 включительно для файла и ранга
        if(file < 0 || file >= 8 || rank < 0 || rank >= 8){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
