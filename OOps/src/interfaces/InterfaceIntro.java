package interfaces;

// Interface -> Used To Achieve PolyMorphism
interface Test {

    // Methods are not defined in Interface
    void meth1();

    // Child Class has to implement each Method to become a concrete class
    void meth2();
}

// All Methods Defined Inside Interfaces are public && abstract (by default)

// Whenever a class implements a Interface, it becomes Abstract as long as it does not overwrite every Method
abstract class My2 implements Test {

}

class My implements Test {
    public void meth1() {
        System.out.println("I am Method 1");
    }
    public void meth2() {
        System.out.println("I am Method 2");
    }

    void meth3() {
        System.out.println("I am Method 3");
    }
}

public class InterfaceIntro {
    public static void main(String[] args) {
        // Reference Of Interface is Allowed
        Test t;

        // Object is not allowed
        // t = new Test();

        // An Interface Can Hold Child Class Object
        t = new My();

        t.meth1();
        t.meth2();
    }
}
