package session3;

public class ReferenceCountingGC {
    public Object instance;
    private static final int _1MB = 1024 * 1024;
    /**
     * 这个成员变量得唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
     */
    private final byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
