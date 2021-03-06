package lib.threads;

import lib.utils.Fibonacci;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FbRun implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private int n;
    private static final int RANGE = 5;
    private static final int LIMIT = 5;
    private static Random rnd = new Random();

    public FbRun() {
        n = rnd.nextInt(RANGE)+LIMIT;
    }

    public FbRun(int n) {
        this.n = n;
    }


    @Override
    public void run() {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < n; i++) {
            System.out.print("#" + id + "." + f.next() + " ");
        }
        System.out.println();
        Thread.yield(); // освобождаем ресурсы
    }
}
