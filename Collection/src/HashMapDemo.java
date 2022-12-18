import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C"));

        // Adding Key Value Pair To Map
        hm.put(4, "D");
        hm.put(6, "F");

        // Returns Value Of Key
        System.out.println(hm.get(6));

        System.out.println(hm);

    }
}
