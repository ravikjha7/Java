package abstraction;

class Parent {
    Parent() {
        System.out.println("Parent Class !!!");
    }

    void display() {
        System.out.println("Inside The Parent Class !!!");
    }
}

class Child1 extends Parent {
    Child1() {
        System.out.println("Base Class !!!");
    }

    @Override
    void display() {
        System.out.println("Inside The Child Class !!!");
    }
}

class Child2 extends Child1 {
    Child2() {
        System.out.println("Child Class !!!");
    }

    @Override
    void display() {
        super.display();
    }
}

interface Child3 {
    void display2();
}

interface Child4 {
    void display3();
}

class Parent2 implements Child3,Child4 {
    @Override
    public void display2() {
        System.out.println("Using The Multiple Inheritance Using Interface !!!");
    }

    @Override
    public void display3() {
        System.out.println("Using The Multiple Inheritance Again");
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.display();

        Parent2 p = new Parent2();
        p.display2();
        p.display3();

        Parent p2 = new Child1();
        System.out.println("I have defined a Child Reference Using A Parent Object, Let's See How Method Overriding Works");
        p2.display();
    }
}
