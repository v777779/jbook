package ch21.ex38.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Reporter implements Runnable {
    private BuildQueue carQueue;

    public Reporter(BuildQueue carQueue) {
        this.carQueue = carQueue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(carQueue.take()); // выбрать тачку и вывести на печать
            }
        } catch (InterruptedException e) {
            System.out.println("Reporter interrupted");
        }
        System.out.println("Reporter  off");
    }

}
