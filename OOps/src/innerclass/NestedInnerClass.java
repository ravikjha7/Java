package innerclass;

class OuterClass {

    // Variable Of Outer Class
    int x = 10;

    // Inner Class
    class InnerClass {

        // Variable Of Inner Class
        int y = 20;

        // You Can Create Object Outside Function Also (i.e Directly Inside Outer Class)
        // InnerClass i2 = new InnerClass();

        // Method Of Inner Class
        void InnerDisplay() {

            // Accessing Member Of Outer Class in Inner Class -> Allowed
            System.out.println(x);

            System.out.println(y);

        }
    }

    // Method Of Outer Class
    public void OuterDisplay() {
        // For Using Inner Class, We Have To Make Its Object First
        InnerClass ic = new InnerClass();

        // Using Function
        ic.InnerDisplay();

        // Direct Access
        System.out.println(ic.y);

        // We can access Methods Or Variables Using Anonymous Objects Also
        new InnerClass().InnerDisplay();
    }

}

public class NestedInnerClass {

    public static void main(String[] args) {

        OuterClass o = new OuterClass();

        o.OuterDisplay();

        // Object Of Inner Class
        OuterClass.InnerClass i = new OuterClass().new InnerClass();
    }

}
