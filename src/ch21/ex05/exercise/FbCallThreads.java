package ch21.ex05.exercise;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FbCallThreads {

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool(); // создаем pool потоков
        ArrayList<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(exec.submit(new FbCall(i)));  // входной параметр  номер потока =id
        }  // загнали все потоки в список  <Future<T>> и они сразу пошли на выполнение

        for (Future<Integer> fs : list) {  // прогоняем список
            try {
                System.out.println(fs.get());     // получить результат  с блокировкой текущего потока
                if(fs.isDone()) {
                    System.out.println(fs.get());  // получить результат если готов, иначе далее
                }

            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            }finally {
                exec.shutdown();  // закрыть poll потоков по любому
            }
        }

    }
}
