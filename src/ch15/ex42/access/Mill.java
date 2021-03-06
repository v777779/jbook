package ch15.ex42.access;

/**
 * Created by V1 on 23.03.2017.
 */
public class Mill implements Comparable {
    private int value = 1; // по умолчанию

    public Mill() {
    }

    public Mill(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        int value2 = ((Mill) o).get();
        if (value > value2) {
            return 1;
        }
        if (value == value2) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Mill{" + value+"}";
    }
}
