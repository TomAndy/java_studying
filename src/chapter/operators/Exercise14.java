package chapter.operators;

public class Exercise14 {
    public void comparator(String st1, String st2) {
        System.out.println(st1==st2);
        System.out.println(st1!=st2);
        System.out.println(st1.equals(st2));
    }

    public static void main(String[] args) {
        Exercise14 ex = new Exercise14();
        ex.comparator("aa","ab");
        System.out.println("=============");
        ex.comparator("aa","aa");
    }
}
