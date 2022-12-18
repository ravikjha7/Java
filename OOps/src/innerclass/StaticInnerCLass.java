package innerclass;

class Outer1 {

    static int x  = 10;
    int y =  20;

    static class Inner {

        void Display() {

            // Accessing Static Members Are Allowed
            System.out.println(x);

            // Not Allowed To Access Non-Static Members Of Outer Class
            // System.out.println(y);
        }

    }
}

public class StaticInnerCLass {
    public static void main(String[] args) {

        // Static Inner Classes Can Be Created Without Creating Object Of Outer Class
        Outer1.Inner o = new Outer1.Inner();

        o.Display();
    }
}
