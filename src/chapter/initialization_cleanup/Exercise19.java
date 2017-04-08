package chapter.initialization_cleanup;

public class Exercise19 {
    static void f(String... arr) {
        for(String st: arr)
           System.out.println(st);
    }

    public static void main(String[] args) {
        Exercise19.f("aq","bq","cq");
        Exercise19.f(new String[]{"aaa","bbb","ccc"});
    }
}
