package chapter.innerclasses.cls;
import chapter.innerclasses.interf.BaseInterface;

public class MainClass {
    protected class B implements BaseInterface {
        public void f1() {
            System.out.println("In inner class B");
        }
    }
}
