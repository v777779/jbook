package ch18.ex08.access;

import lib.files.BFileRead;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 FileRead Check\n");

        if (args == null || args.length == 0) {
            System.out.println("Usage: args[0] <filePath>");
        }
        if (args.length == 0) {
            args = new String[]{"./src/ch18/ex08/exercise/Exercise.java"};
        }
        List<String> list = new LinkedList<>(BFileRead.readList(args[0]));
        for ( ListIterator<String> lit = list.listIterator(list.size());lit.hasPrevious();) {
            System.out.println(lit.previous());
        }

    }
}
