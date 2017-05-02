package ch21.ex15.exercise;

import lib.utils.Time;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreeSection2 extends ThreeSecBase {
    Object syncObject = new Object();
    Object syncObject2 = new Object();
    Object syncObject3 = new Object();
    public void m01(int id) {
        synchronized (syncObject) {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.print("#"+id+"." + i + " ");
                Time.sleep(rnd.nextInt(5));
            }
            System.out.println();
        }
    }

    public void m02(int id) {
        synchronized (syncObject2) {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.print("#"+id+"." + i + " ");
                Time.sleep(rnd.nextInt(5));
            }
            System.out.println();
        }
    }

    public void m03(int id) {
        synchronized (syncObject3) {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.print("#"+id+"." + i + " ");
                Time.sleep(rnd.nextInt(5));
            }
            System.out.println();
        }
    }
}
