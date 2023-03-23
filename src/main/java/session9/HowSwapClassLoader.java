package session9;

public class HowSwapClassLoader extends ClassLoader {

    public HowSwapClassLoader() {
        super(HowSwapClassLoader.class.getClassLoader());
    }

    public Class<?> loadByte(byte[] classByte) {
        return defineClass(null, classByte, 0, classByte.length);
    }
}
