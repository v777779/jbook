package ch21.ex29.exercise.toster;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JellyMaker implements Runnable {
    private ToastQueue dryQueue;        // очередь входящая с объектами тост
    private ToastQueue finishedQueue;   // очередь выходящая с объектами тост
    private Random rnd = new Random();


    public JellyMaker(ToastQueue dryQueue, ToastQueue finishedQueue) {
        this.dryQueue = dryQueue;
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                Toast t = dryQueue.take();  // взять тост из очереди входящей
                t.jelly();                  // намазать желе
                System.out.println(t);      // распечатали
                finishedQueue.put(t);       // положить объект в очередь выходящую
            }
        } catch (InterruptedException e) {
            System.out.println("JellyMaker interrupted");
        }
        System.out.println("JellyMaker off");
    }
}
