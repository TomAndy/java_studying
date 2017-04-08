package chapter.operators;

public class Exercise12 {
    public static void main(String[] args) {
        int a = 0xf;
        System.out.println(Integer.toBinaryString(a));
        a=a <<1;
        System.out.println(Integer.toBinaryString(a));
        a=a >>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a >>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a >>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a >>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a >>>1;
        System.out.println(Integer.toBinaryString(a));
    }
}
