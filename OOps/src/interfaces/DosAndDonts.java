package interfaces;

interface Test1 {

    // Identifiers Should Be Capitalised
    // By Default Identifiers are Final && Static
    final static int X = 10;

    // Methods Of An Interface is By Default Public && Abstract
    public abstract void meth1();

    // We can define Body of a Method by making it static
    public static void meth3() {
        System.out.println("Meth3 of Test Interface !!!");
    }

    // Starting From Java 8, You Can Define A Default Method Also in an Interface
    // No Need To Override default Methods
    default void meth4() {
        System.out.println("Hey! I am a Default Method !!!");
    }
    // This is used When we want to update Interfaces without disturbing Child Classes

    // Starting From Java 9, You Can Also Define A Private Method Inside An Interface
    private void meth5() {
        System.out.println("I am Private Method !!!");
    }

    // But since, private Methods cannot be called Outside The Interface, It can be used just inside Default Methods
    default void meth2() {
        meth5();
    }
}
interface Test2 extends Test1  {
    public void meth2();
}

public class DosAndDonts {
    public static void main(String[] args) {
        // We can access Static Variables and Methods Of Interface
        System.out.println(Test1.X);
        Test1.meth3();
        // Because Static Methods Does Not Need You To Make An Object


    }
}
