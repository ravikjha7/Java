import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        // Unordered Set -> With Defined Capacity
        HashSet<Integer> hs = new HashSet<>(10);

        // With Capacity and Loading Factor
        HashSet<Integer> hs2 = new HashSet<>(19,0.5f);

        // Adding Elements To Set
        hs.add(7);
        hs.add(3);
        hs.add(8);
        hs.add(99);

        System.out.println(hs);
    }
}
