package chapter.operators;

public class Exercise6 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";

        Dog dog2 = new Dog();

        dog2=dog1;

        System.out.println(dog1 ==dog2);
        System.out.println(dog1.equals(dog2));

        System.out.println(dog1.name == dog2.name);
        System.out.println(dog1.name.equals(dog2.name));

        System.out.println(dog1.says == dog2.says);
        System.out.println(dog1.says.equals(dog2.says));
        System.out.println(dog2.name);
    }
}