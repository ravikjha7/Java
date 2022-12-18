package innerclass;

abstract class My {
    abstract void display();
}

interface My2 {
    void display();
}

// Anonymous Inner Class -> A Class Made During Declaration Of Object

class Outer {

    public void meth() {

        // Reference Of Abstract Class Holding The Object Of Anonymous Class
        My m = new My(){
          public void display() {
              System.out.println("Hello");
          }
        };

        m.display();
    }

    public void meth2() {

        // Reference Of Abstract Class Holding The Object Of Anonymous Class
        My2 m = new My2(){
            public void display() {
                System.out.println("Hello 2");
            }
        };

        // Using Anonymoud Object
        new My2(){ public void display() { System.out.println("Hello 3"); }}.display();

        m.display();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.meth();
        o.meth2();
    }
}
