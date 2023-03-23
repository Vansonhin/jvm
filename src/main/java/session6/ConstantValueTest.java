package session6;

public class ConstantValueTest {
    public static final int a = 129;
    public static int b = 40000;

    void onlyMe(ConstantValueTest foo) {
        synchronized (foo) {

        }
    }

    public static void main(String[] args) {

    }
}
