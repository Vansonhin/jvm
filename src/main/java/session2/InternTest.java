package session2;

public class InternTest {
    public static void main(String[] args) {
        String str1 = new StringBuilder("j").append("ava").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("fu").append("ck").toString();
        System.out.println(str2.intern() == str2);

        String str3 = new StringBuilder("s").append("tatic").toString();
        System.out.println(str3.toString() == str3);
    }
}
