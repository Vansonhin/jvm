package session7;

/**
 * 通过数组定义来引用类，不会触发此类的初始化
 */
public class NoInitialization2 {
    public static void main(String[] args) {
        SuperClass[] arr = new SuperClass[10];
    }
}
