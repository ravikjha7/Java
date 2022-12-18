import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(5);

        // Adding Elements To Linked Hash Set
        lhs.add("A");
        lhs.add("N");
        lhs.add("A");
        lhs.add("R");
        lhs.add("V");
        lhs.add("I");

        lhs.forEach(x -> System.out.println(x));
    }
}
