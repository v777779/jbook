package ch17.ex33.access;

import lib.tests.ListCheck;
import lib.tests.ListTester;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.LinkedList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 33 Check\n");
        System.out.println("\nHigh Level Tester:");
        Tester.defaultParams = TestParam.array(
                10,5000,100,5000,1000,1000,10000,200
        );

        ListTester.run(new LinkedList<Integer>(), ListCheck.tests);  // параметры прописались

    }
}
