package lib.utils;

import java.util.Collection;

/**
 * Created by V1 on 16.03.2017.
 */
public class Generators {
    public static <T> Collection <T> fill(Collection<T> col, IGenerator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            col.add(gen.next()); // функция реализация класса интерфейса генератора
        }
        return col; // выгрузить заполненную Collection
    }
}
