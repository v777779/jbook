package ch06.ex3;

/**
 * Created by V1 on 07-Feb-17.
 */
//import static lib.debugoff.Debug.*;   // импортируется метод debug() который работает как Off
import static lib.debug.Debug.*;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Exercise 3  Check Compilation");
        debug();
        System.out.print("Class with enabled version of Debug > ");
        EnDebug.show();
        System.out.print("Class with disabled version of Debug > ");
        DiDebug.show();

    }
}