package chapter.interfaces;

interface FastFood {
    void createHotdog();
    void createHamburger();
}

class Meal {
    Meal() {  System.out.println("Meal()"); }
}
class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}

class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() {
        System.out.println("Sandwich()");
        createHotdog();
        createHamburger();
    }

    @Override
    public void createHotdog() {
        System.out.println("Hotdog created");
    }

    @Override
    public void createHamburger() {
        System.out.println("Hamburger created");
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        new Sandwich();
    }
}
