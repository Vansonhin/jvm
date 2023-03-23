package session4;

import java.util.ArrayList;
import java.util.List;

public class JConsoleTest1 {
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fileHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        fileHeap(1000);
        System.gc();
    }
}
