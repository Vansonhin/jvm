package session3;

public class TenuringThresholdTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            byte[] allocation1, allocation2, allocation3;
            allocation1 = new byte[_1MB * 8];
            allocation2 = new byte[_1MB * 8];
        }).start();
        System.out.println("sleep...");
        Thread.sleep(1000);
    }
}
