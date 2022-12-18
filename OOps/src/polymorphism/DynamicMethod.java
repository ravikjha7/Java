package polymorphism;

class Super {
    public void display1() {
        System.out.println("Parent Class 1");
    }
    public void display2() {
        System.out.println("Parent Class 2");
    }
}

class Child extends Super {
    public void display2() {
        System.out.println("Child Class 2");
    }

    public void display3() {
        System.out.println("Child Class 3");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {

        Super su = new Child();

        su.display1(); // Allowed

        su.display2(); // Allowed -> Will Run Method Of Object Class Not Reference Class

        // su.display3(); // Not Allowed

        // Only Functions Defined in Reference Class are allowed, If Any Method is Overridden in Object Class
        // Then It will run from Object Class

    }
}
