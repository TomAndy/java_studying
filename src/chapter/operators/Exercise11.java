package chapter.operators;

public class Exercise11 {
    public static void main(String[] args) {
        int a = 0x11;
        System.out.println(Integer.toBinaryString(a));
        System.out.println();
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
    }
}
