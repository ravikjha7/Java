public class TryCatchDemo {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 7, 0};

        try {
            int ans = arr[0]/arr[7];

            System.out.println(ans);

        } catch(ArithmeticException e) {

            System.out.println("Cannot Divide By Zero !!! " + e);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e);

        }
    }
}
