package session7;

/**
 * 通过子类引用父类的静态字段，不会导致子类初始化
 */
class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

//    public static final int value = 123; // final修饰的话，在编译阶段通过常量传播优化，已经将这个123存储到了SubClass的常量池中。
    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}

public class NoInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
