package ch15.ex31.access;

/**
 * Created by V1 on 21.03.2017.
 */
public class Employee implements IPayable {
    @Override
    public void payCheck(Object arg) {
        System.out.println("Employee.payCheck:"+arg.getClass().getSimpleName());
    }
}