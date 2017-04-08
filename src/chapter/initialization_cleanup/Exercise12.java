package chapter.initialization_cleanup;

class Tank {
    boolean emptyState = false;
    Tank(boolean state) {
        emptyState=state;
    }

    void isEmpty() {
        emptyState = true;
    }

    void isFilledIn() {
        emptyState = false;
    }

    protected void finalize() throws Throwable{
        if (emptyState)
        {
            System.out.println("Object will be vanished");
            super.finalize();
        }
    }
}
public class Exercise12 {

    public static void main(String[] args) throws Throwable{
//        Tank tank = new Tank(true);
//        tank.isEmpty();
//        tank.finalize();

        Tank tank2 = new Tank(true);
        tank2.isFilledIn();
        tank2.finalize();

    }
}
