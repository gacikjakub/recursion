package hanoiTower;

import java.util.Objects;

public class Disk {

    public final int size;

    public Disk(int size) {
        this.size = size;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Disk) {
            return size == ((Disk) obj).size;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return Integer.toString(size);
    }

}
