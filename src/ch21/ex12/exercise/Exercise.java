package ch21.ex12.exercise;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 01-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 12 Atomicity Check\n");
        System.out.println("Atomicity Test:");
        AtomicityTest2.check();
        Time.sleep(1500);
    }
}
