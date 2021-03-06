package ch09.ex07.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class NorwayRat extends Rat implements Rodent {

    public NorwayRat() {
        System.out.println("NorwayRat.Constructor");
    }

    @Override
    public void dispose() {
        System.out.println("NorwayRat.dispose");
        super.dispose();
    }

    @Override
    public void addRef() {

    }
    @Override
    public void voice() {
        System.out.println("NorwayRat.voice");
    }

    @Override
    public void eat() {
        System.out.println("NorwayRat.eat");
    }

    @Override
    public void sleep() {
        System.out.println("NorwayRat.sleep");
    }

    @Override
    public void run() {
        System.out.println("NorwayRat.run");
    }


    @Override
    public String toString() {
        return "NorwayRat{}";
    }


}
