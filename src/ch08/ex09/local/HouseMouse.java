package ch08.ex09.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class HouseMouse extends Mouse {
    @Override
    void voice() {
        System.out.println("HouseMouse.voice");
    }

    @Override
    void eat() {
        System.out.println("HouseMouse.eat");
    }

    @Override
    void sleep() {
        System.out.println("HouseMouse.sleep");
    }

    @Override
    void run() {
        System.out.println("HouseMouse.run");
    }

    @Override
    public String toString() {
        return "HouseMouse{}";
    }
}
