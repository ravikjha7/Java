package polymorphism;

class Super2 {
    public void display() {
        System.out.println("Parent Class");
    }
}

class Child2 extends Super2 {
    // Name Of Method should be same
    // Arguments -> Same : Override
    // Arguments -> Diff : Overload
    public void display() {
        System.out.println("Child Class");
    }
}

// Return Type Of Overriding Or OverLoading Function cannot be Different
// Special Case : If Return Type is a Class, Then A Different Return Type can be its Extended Child Class

class A {
    public Super2 WoW() {
        return new Super2();
    }
}

class B extends A {
    public Child2 WoW() {
        return new Child2();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

    }
}
