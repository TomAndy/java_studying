package chapter.interfaces;

enum Note {MIDDLE_C};

abstract class CommonMethods {
    abstract void adjust();
}

interface Instrument {
    int VALUE = 5; // static & final
    void play(Note n); // Automatically public
//    void adjust();
}
class Wind extends CommonMethods implements Instrument{
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}
class Percussion extends CommonMethods implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}
class Stringed extends CommonMethods implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

public class Exercise9 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    static void adjustAll(CommonMethods[] e) {
        for(CommonMethods i: e) {
            i.adjust();
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed()};
        tuneAll(orchestra);
        CommonMethods[] insrt = {new Wind(), new Percussion(), new Stringed()};
        adjustAll(insrt);
    }
}
