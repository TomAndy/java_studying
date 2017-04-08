package chapter.interfaces;

interface Cycle {
    void run();
    void stop();
}

interface CycleFactory {
    Cycle getCycle();
}

//********************************
class Unicycle implements Cycle {
    Unicycle() {};
    public void run() {
        System.out.println("Unicycle runs");
    }

    public void stop() {
        System.out.println("Unicycle stops");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

//*********************************
class Bicycle implements Cycle {
    Bicycle() {};
    public void run() {
        System.out.println("Bicycle runs");
    }

    public void stop() {
        System.out.println("Bicycle stops");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

//*********************************
class Tricycle implements Cycle {

    Tricycle() {};
    public void run() {
        System.out.println("Tricycle runs");
    }
    public void stop() {
        System.out.println("Tricycle stops");
    }

}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

//*****************************
public class Exercise18 {
    public static void cycleCreator(CycleFactory fact) {
        Cycle c = fact.getCycle();
        c.run();
        c.stop();
    }

    public static void main(String[] args) {
        cycleCreator(new UnicycleFactory());
        cycleCreator(new BicycleFactory());
        cycleCreator(new TricycleFactory());
    }
}
