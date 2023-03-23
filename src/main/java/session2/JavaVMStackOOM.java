package session2;

public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {}
    }

    public void stackLeadByThread() {
        while (true) {
            Thread thread = new Thread(this::dontStop);
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeadByThread();
    }
}
