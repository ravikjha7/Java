import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // An Old Class From Java Legacy
        Hashtable ht = new Hashtable();

        // No Need TO Specify Data Types, Because It Always Takes an Object
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");

        // We need to typecast because it always returns an Object irrespective of its Data Type
        String s = (String)ht.get(3);

        // Compute Function Will Update Value Of Key (2 Here) To The Returning Value Of Function
        ht.compute(2,(k,v)-> v + "Z");


        // It will Add A Key and Value If It is Not Present
        ht.computeIfAbsent(7,(k)-> k + "Z");

        // For Values
        Enumeration e = ht.elements();

        // For Keys
        Enumeration e2 = ht.keys();

        while(e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();
    }
}
