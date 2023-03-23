package session4;

/**
 * -XX:+PrintAssembly -XX:+UnlockDiagnosticVMOptions -Xcomp -XX:CompileCommand=dontinline,*HSDISTest.sum -XX:CompileCommand=compileonly,*HSDISTest.sum
 */
public class HSDISTest {
    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        new HSDISTest().sum(3);
    }
}
