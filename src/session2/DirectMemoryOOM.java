package session2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        while (true) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1MB);
        }
    }
}
