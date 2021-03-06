package ch21.ex41.codea;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ActiveObjectDemo {
    private ExecutorService exec = Executors.newSingleThreadExecutor();
    private Random rnd = new Random();
    private void pause(int factor) {
        try {
            TimeUnit.MILLISECONDS.sleep(100+rnd.nextInt(factor));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Future<Integer> calculateInt(final int x, final int y) { // в отдельный поток сразу объект Future
        return exec.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("starting "+ x+ " + "+y);
                pause(50); // 100..150ms
                return x+y;
            }
        });
    }


    public Future<Float> calculateFloat(final float x, final float y) { // в отдельный поток сразу объект Future
        return exec.submit(new Callable<Float>() {
            @Override
            public Float call() throws Exception {
                System.out.println("starting "+ x+ " + "+y);
                pause(200); // 100..200ms
                return x+y;
            }
        });
    }

    public void shutdown() {
        exec.shutdown();
    }

    public static void check() {
        ActiveObjectDemo d1 = new ActiveObjectDemo();

        List<Future<?>> results = new CopyOnWriteArrayList<>(); // список с блокировкой синхронный
//        List<Future<?>> results = new ArrayList<>(); // список с блокировкой синхронный


        for (float f = 0.0f;f< 1.0f;f+= 0.2f) {
            results.add(d1.calculateFloat(f,f));  // сразу выполняемые объекты в отдельных потоках
        }
        for (int i = 0; i < 5; i++) {
            results.add(d1.calculateInt(i , i));
        }

        System.out.println("All asynchronous calls made");
        while (results.size() > 0) {
 //           List<Future<?>> clone = new ArrayList<>(results); // работа с обычным списком
            for (Future<?> f : results) {
                if (f.isDone()) {
                    try {
                        System.out.println(f.get());
                    }catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    results.remove(f); // удалить из списка во время итераций только может CopyOnWriteArrayList
                }
            }
        }
        d1.shutdown();
    }

}
