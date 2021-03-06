package ch18.ex04.local;

import lib.files.Catalog;
import lib.files.PPrint;

import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nCatalog2 Methods Check\n");

        System.out.println("Simple Demo:");
        System.out.println(Catalog.walk("./src/ch18/ex04"));
        System.out.println("CodeA Directory:");
        File[] files = Catalog.local("./src/ch18/ex04/local","[.+Lo].*");
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("\nDirectory Demo:");
        PPrint.print(Catalog.walk("./src/ch18/ex04").getListDirs());
        System.out.println("\nFiles codea() with M started:");
        for (File file : Catalog.local("./src/lib/pets", "M.*")) {
            System.out.println(file);
        }
        System.out.println("\nFiles codea() with M started and .java:");
        for (File file : Catalog.local("./src/lib/pets", "M.*.java")) {
            System.out.println(file);
        }
        System.out.println("\nFiles walk() with Z,z :");
        PPrint.print(Catalog.walk("./src", ".*[Zz].*\\.java").getListFiles());



        //Catalog2.walk("./src","T.*"));

    }
}
