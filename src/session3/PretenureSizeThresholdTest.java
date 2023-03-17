package session3;

public class PretenureSizeThresholdTest {
    private static final int _1MB = 1024 * 1024;

    public static void test() {
        byte[] allocation = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        test();
    }
}
