package ch11.ex05.local;

import lib.pets.*;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */


public class PetList {


    void show() {
        Random rnd = new Random();
        List<Pet> pets = Pets.arrayList(7);  // сработало
        System.out.println(" 1:"+pets);

        Hamster h = new Hamster(); // добавить новый класс порода
        System.out.println("  : h > "+h);
        pets.add(h);
        System.out.println(" 2: add(h) > "+pets);

        System.out.println(" 3: contains(h)>"+pets.contains(h)); // проверка оператора contains

        pets.remove(h);                                                     // удалить объект
        System.out.println("  : remove(h)>"+pets);                           // удаление по объекту

        Pet p = pets.get(4);
        System.out.println(" 4: p > get(4)>"+p+", indexOf(p)>"+pets.indexOf(p));  // работа с объектом по индексу и по объекту

        Pet c = new Cymr();                                  // объект заданной породы новый для pets
        System.out.println("  : c > "+c);  // работа с объектом по индексу и по объекту
        System.out.println(" 5: indexOf(c)>"+pets.indexOf(c)); // неизвестный объект не берет индекс
        System.out.println(" 6: remove(c)>"+pets.remove(c));   // неизвестный объект не удаляет

        System.out.println("  :"+pets);                        // до удаления
        System.out.println(" 7: remove(p)"+pets.remove(p));              // удалить известный объект

        System.out.println(" 8:"+pets);                        // после удаления

        pets.add(3,new Mouse());                         // добавить новый объект
        System.out.println(" 9:"+pets);                        // после добавления

        List<Pet> sub = pets.subList(1,4);                       // вытащить sublist [1,2,3] 4 не входит
        System.out.println("  : sub[1,4]>"+sub); // частичный список
        System.out.println("10: containsAll()>"+pets.containsAll(sub)); // проверяет содержится ли частичный список в общем
// сортировка
        Collections.sort(sub);                                          // сортировка sublist
        System.out.println("  : sort   >"+sub);                         // после сортировки
        System.out.println("11: containsAll()>"+pets.containsAll(sub)); // после сортировки и перемешивания
// перемешивание
        Collections.shuffle(sub,rnd);
        System.out.println("  : shuffle>"+sub);                          // после сортировки
        System.out.println("12: containsAll()>"+pets.containsAll(sub)); // после сортировки и перемешивания
// клонирование
        List<Pet> copy = new ArrayList<>(pets);                             // клонируем pets
        sub = Arrays.asList(pets.get(1),pets.get(4));
        System.out.println("  : copy>"+copy+" size>"+copy.size());          // элементы с копии
        System.out.println("  : get(1)(4)>"+sub+"  size>"+sub.size());      // элементы с копии
        copy.retainAll(sub);                                    // оставить только те элементы которые есть в sublist
        System.out.println("12:retainAll()>"+copy+" size>"+copy.size());    // скопировать

        copy = new ArrayList<>(pets);                                       // новая копия
        System.out.println("  : copy>"+copy+" size>"+copy.size());          // элементы с копии

        copy.remove(2);
        System.out.println("14: remove(2)>"+copy+" size>"+copy.size());     // удаление по индексу

// удаление элементов, идет строго по объектам, как ссылкам
        System.out.println("  : containsAll()>"+copy.containsAll(sub));     // проверяем sublist активный
        System.out.println("  :               >"+copy+" size>"+copy.size()+"  sub>"+sub+" size>"+sub.size());
        copy.removeAll(sub);                    // удалить элементы sublist из основного списка
        System.out.println("15: removeAll(sub)>"+copy+" size>"+copy.size());

        System.out.println("  :             >"+copy+" size>"+copy.size());
        copy.set(1,new Mouse());                // 1й элемент задать
        System.out.println("16: set(1,Mouse)>"+copy+" size>"+copy.size());

        copy.addAll(sub);                       // добавить все объекты из списка
        System.out.println("17: addAll()>"+copy+" size>"+copy.size());
        System.out.println("18: isEmpty()>"+pets.isEmpty());
        pets.clear();                           // удаление всего
        System.out.println("19: isEmpty()>"+pets.isEmpty()+" pets>"+pets);
        System.out.println("20: pets>"+pets);

        pets.addAll(Pets.arrayList(4));     // сгенерить новый объект на 4 элемента
        System.out.println("21: pets>"+pets);

        Object[] o = pets.toArray();
        System.out.println("22: toArray()>"+Arrays.toString(o));  // создали массив
        Pet[] pa = pets.toArray(new Pet[1]);  // расширение массива
        System.out.println("23: toArray(new [1])>"+Arrays.toString(pa)+" id>"+pa[0].getId());
        Pet[] pb = pets.toArray(new Pet[8]);  // автозаполнение массива
        System.out.println("24: toArray(new[8])>"+Arrays.toString(pb)+" id>"+pb[1].getId());






    }

}
