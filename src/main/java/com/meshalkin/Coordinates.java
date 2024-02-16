package com.meshalkin;
import java.util.Objects;

public class Coordinates {
    public File file; // вертикаль
    public Integer rank; // горизонталь

    public Coordinates(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return file == that.file && Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
    public Coordinates shift(CoordinatesShit shit){
        return new Coordinates(File.values()[this.file.ordinal()+shit.x], this.rank+shit.y);
    }
    public boolean canShift(CoordinatesShit shift){
        int f = file.ordinal() + shift.x;
        int r = rank + shift.y;
        if((f < 0) || (f > 8)){
            return false;
        }
        if((r < 0) || (r > 8)){
            return false;
        } else {
            return true;
        }
    }
}
