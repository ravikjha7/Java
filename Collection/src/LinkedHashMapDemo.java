import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);

        // For Sorting According To Most Recently Used
        // LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true);

        // To Make A Limit On Size Of Map
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size() > 5;
            }
        };

        // Adding Values Into Linked Hash Map
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");

        String s = lhm.get(4);
        String s2 = lhm.get(1);

        lhm.put(8,"H");
        lhm.put(7,"G");

        lhm.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
