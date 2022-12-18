package staticandfinal;

// final same as const in C, C++

// Notation : All Caps
// Three Way Of Initialising it

class My {

    // First Way
    final int MIN = 1;

    // We can initialise afterwards also
    // like
    // final int MIN;
    // MIN = 1;

    static final int NORMAL;

    final int MAX;

    // Second Way
    static {
        NORMAL = 7;
    }

    // We can initialise inside {
    // } i.e normal block also (only non-static variables)

    // Third Way
    My() {
        MAX = 10;
    }

    final void meth1() {
        System.out.println("Hello");
    }
}

class Child2 extends My {

    // Overriding Static Methods Are Not Allowed

//        void meth1() {
//            System.out.println("Override !!!");
//        }
}

// Extending Static Classes Are Not Allowed

public class FinalIntro {
    public static void main(String[] args) {

    }
}
