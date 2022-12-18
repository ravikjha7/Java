package staticandfinal;

class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;

    // A Reference To Make Sure Only One Object Could Be Created !!!
    static private CoffeeMachine c1 = null;

    // Constructor Is Private, So Objects Cannot Be Made Directly
    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
    }

    // Static Method To Create The Object
    static public CoffeeMachine getInstance() {
        if(c1 == null) c1 = new CoffeeMachine();
        return c1;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        // This will create the Object
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();


        if(c1 == c2) System.out.println("Same !!!");

        // CoffeeMachine c1 = new CoffeeMachine(); --> This will not work as Constructor Is Private
    }
}
