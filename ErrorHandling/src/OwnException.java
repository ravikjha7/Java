// We have to define a class for our own Exception which should be inheriting from Exception Class
class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance Should Not Be Less Than 5000";
    }
}
public class OwnException {
    static void fun1() {
        try {
            // We have to throw Exception explicitly as we only know when Exception is actually caused
            throw new LowBalanceException();
        } catch(LowBalanceException e) {
            // We do not need to write toString as it always converts e to e.toString() inside S.o.P
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        fun1();
    }
}
