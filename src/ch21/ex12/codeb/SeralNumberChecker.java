package ch21.ex12.codeb;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SeralNumberChecker {
    private static final int SIZE = 10;

    private static CircularTest serials = new CircularTest(1000); //массив на 1000 номеров
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static class SerialChecker implements Runnable {
        @Override
        public void run() {
            while (true) {
                int serial = SerialNumberGenerator.nextSerialNumber();
                if (serials.conatins(serial)) {
                    System.out.println("Duplicate: "+serial);
                    break;
                }
                serials.add(serial);
            }
        }
    }

    public static void check() {
        for (int i = 0; i < SIZE; i++) {
            exec.execute(new SerialChecker());
        }
        Time.sleep(1000);
        exec.shutdown();

    }
}
