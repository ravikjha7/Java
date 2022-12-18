public class ExceptionClasses {

    // Checked Exception : The Exceptions Which Always Need To Be Handled
    // e.g File IO Exceptions
    static void fun1() {
        fun2();
    }
    static void fun2() {
        try {
            // Unchecked Exception : Exception Which is Not Compulsory To Handle
            // e.g Arithmetic Exception, ArrayOutOfBound Exception
            int a = 10 / 0;
        } catch(Exception e) {

            System.out.println(e.getMessage());

            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        fun1();
    }
}
