package staticandfinal;

// static keyword is used to represent Metadata
// Means Not Related To Object But Related To Class

// Static Variables Are Created Inside Method Area -> It is Loaded When Class is Loaded

class Hondacity {

    // price refers to price of the Car not the Car bought by you or someone else
    // There is only one copy of static variables, which is shared by All Objects Of Class
    static long price = 10;

    int a, b;

    static {
        System.out.println("Static Block 1");
        price = 100;
    }

    // Static Methods Can Access Static Variables Of Class Only
    static double onRoadPrice(String city) {

        // We cannot use Keywords like this or super inside static Methods or Class

        return price + price*0.1;
    }
}

public class StaticIntro {
    public static void main(String[] args) {

        Hondacity c1 = new Hondacity();
        Hondacity c2 = new Hondacity();

        // price is shared by c1 and c2
        System.out.println(c1.price);
        System.out.println(c2.price);

        // if we change one, other will be automatically changed
        c1.price = 100;
        System.out.println(c1.price); // 100
        System.out.println(c2.price); // 100

        // Static Variables Can Be Accessed Without Creating Objects Also
        System.out.println(Hondacity.price);
    }
}
