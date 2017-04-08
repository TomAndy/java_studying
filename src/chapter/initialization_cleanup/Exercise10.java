package chapter.initialization_cleanup;

public class Exercise10 {
    boolean checkedout = false;
    Exercise10 (boolean a) {
        checkedout = a;
    }
    void checkedin() {
        checkedout = false;
    }
    protected void finalize() {
        if(checkedout)
            System.out.println("Garbage collector was called");
    }

    public static void main(String[] args) {
        Exercise10 exerc = new Exercise10(true);
        exerc.checkedin();
        new Exercise10(true);
        System.gc();

    }
}
