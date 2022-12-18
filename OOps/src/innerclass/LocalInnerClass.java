package innerclass;

// Local Inner Class : A Class Defined Inside A Method Of Outer Class is Called As Local Inner Class

class OuterClass1 {

    void Display() {

        // Class Inside Method Of Outer Class
        class InnerClass {
            void InnerDisplay() {
                System.out.println("Hello !!!");
            }
        }

        InnerClass i = new InnerClass();
        i.InnerDisplay();
    }

}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass1 o = new OuterClass1();
        o.Display();
    }
}
