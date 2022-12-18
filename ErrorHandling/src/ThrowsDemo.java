import com.sun.jdi.request.ExceptionRequest;

class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return "Length Or Breadth Cannot Be Negative !!!";
    }
}

public class ThrowsDemo {
    static void fun1() throws Exception{
        fun2();
    }

    // We write throw when we want to throw an Exception
    // We write throws when we want to define that hey this function can actually throw an exception

    static int area (int l, int b) throws Exception {
        if(b < 0 || l < 0) throw new Exception("Length Cannot Be Negative");
        return l*b;
    }

    static int area2 (int l, int b) throws Exception {
        if(b < 0 || l < 0) throw new NegativeDimensionException();
        return l*b;
    }

    // Now the parent function of the function must be written in try catch block
    // Else it also has to throw the Exception

    static void fun2() throws Exception{
        int a = area2(10, -5);
    }
    public static void main(String[] args) {
        try {
            fun1();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
