package ch20.ex09.exercise;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 26-Apr-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise Check\n");
        System.out.println();

        AtUnitExec.check("out\\production\\jb01\\ch20\\ex09\\exercise\\HashMapTest");
    }
}
