package lib.annot;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@EIFace72("IMultiplier74")   // назначение вытащить открытый интерфейс класса
@EIFace75("IMultiplier75")   // назначение вытащить открытый интерфейс класса
public class Mult {
    public int value;
    private String name;
    public int multiply(int x, int y) {
        int total = 0;
        for (int i = 0; i < x; i++) {
            total = add(total,y);
        }
        return total;
    }

    private int add(int x, int y) {
        return x+y;
    }

}
