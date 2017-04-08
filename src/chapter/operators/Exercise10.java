package chapter.operators;

public class Exercise10 {
    public static void main(String[] args) {
        int a= 0x12;
        int b = 0x13;
        System.out.println(Integer.toBinaryString(a)+"    "+Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a^b));
    }
}
