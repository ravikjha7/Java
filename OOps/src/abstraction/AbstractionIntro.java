package abstraction;

// Abstraction : Hiding Of Unnecessary Data / Implementation Of Methods

// Classes -> 1) Concrete -> Objects Of Such Class Can Be Created
//            2) Abstract -> Objects Of Such Class Cannot Be Created

// Abstract Method -> If A Method Name is Defined, But Its Body is Not Defined v7r7rur
// Abstract Class -> A Class with at least one Abstract Method defined in it

// Abstract class
abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("Constructor Called");
    }
    // Abstract Method : Method without a body making the class Abstract as well
    abstract void abs();
}

// Child Of Abstract Class
class Child extends AbstractClass {
    public Child() {
        System.out.println("Child Class");
    }
    // Overriding The Abstract Method
    @Override
    public void abs() {
        System.out.println("Overriding SuccessFul");
    }
}

public class AbstractionIntro {
    public static void main(String[] args) {
        Child cp = new Child();
        cp.abs();
    }
}

// Rules :
// 1) You cannot make static abstract Classes or Methods
// 2) You cannot make final abstract Methods
