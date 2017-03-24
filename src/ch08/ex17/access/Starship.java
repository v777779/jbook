package ch08.ex17.access;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Starship {
    public Starship() {
        System.out.println("Starship.Constructor");
    }

    AlertStatus alertStatus = new NormalState();
    public void changeStatus() {
        alertStatus = new EmergencyState();
    }
    public void getStatus() {
        alertStatus.status();
    }
}
