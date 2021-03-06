package ch12.ex28.access;

/**
 * Created by V1 on 01-Mar-17.
 */
public class CException extends RuntimeException {
    private String message;
    public CException() {
    }

    public CException(String message) {
        super(message);
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }
    @Override
    public String toString() {
        return "CException{" +
                "message='" + message + '\'' +
                '}';
    }
}
