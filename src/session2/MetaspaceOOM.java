package session2;

import java.util.HashSet;
import java.util.Set;

/**
 * 自JDK7起，原本存放在永久代的字符串常量池被移至Java堆中
 * -Xmx6m
 */
public class MetaspaceOOM {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        int i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
