package ch08.ex12.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Muskrat extends Rat {
    @Override
    void voice() {
        System.out.println("Muskrat.voice");
    }

    @Override
    void eat() {
        System.out.println("Muskrat.eat");
    }

    @Override
    void sleep() {
        System.out.println("Muskrat.sleep");
    }

    @Override
    void run() {
        System.out.println("Muskrat.run");
    }

    @Override
    public String toString() {
        return "Muskrat{}";
    }

    public Muskrat() {
        System.out.println("Muskrat.Constructor");
    }

    @Override
    protected void dispose() {
        System.out.println("Muskrat.dispose");
        super.dispose();
    }
}
