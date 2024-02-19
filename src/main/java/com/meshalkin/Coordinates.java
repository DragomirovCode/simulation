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
    public Coordinates shift(CoordinatesShift shit){
        return new Coordinates(File.values()[this.x.ordinal()+shit.x], this.y +shit.y);
    }
    public boolean canShift(CoordinatesShift shift){
        int file = x.ordinal() + shift.x;
        int rank = y + shift.y;
        if((file < 0) || (file > 8)){
            return false;
        }
        if((rank < 0) || (rank > 8)){
            return false;
        } else {
            return true;
        }
    }
}
