import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C"));

        // Adding Key Value Pair To Map
        tm.put(4,"D");
        tm.put(6,"F");

        // Find Value Greater Than Or Equal To Required
        System.out.println(tm.ceilingEntry(5).getValue());

        // Taking Out An Entry
        Map.Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());

        // Returns Value Of Key
        System.out.println(tm.get(6));

        System.out.println(tm);

    }
}
