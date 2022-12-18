import java.util.*;

public class ArrayListDemo {
        public static void main(String []arg)
        {
            ArrayList<Integer> arr = new ArrayList<>(10);
            ArrayList<Integer> arr2 = new ArrayList<>(List.of(10,20,30));

            // Adding An Element
            arr.add(10);
            // Adding An Element At Index 2
            arr.add(1,7);
            // Adding ArrayList 2 to ArrayList 1
            arr.addAll(arr2);
            // Adding ArrayList 2 to ArrayList 1 at Index 4
            arr.addAll(4,arr2);
            // Contains Returns True If Element is Present Else False
            System.out.println(arr.contains(20));
            // Also used for checking an entire ArrayList Present Or Not
            System.out.println(arr.containsAll(arr2));
            // To Get An Element At Particular Index
            System.out.println(arr.get(5));
            // To Find Index Of Required Element
            System.out.println(arr.indexOf(7));
            // To Find Last Index Of Required Element
            System.out.println(arr.lastIndexOf(10));
            // To Update Element At Particular Index
            arr.set(2,99);

            // For Loop
            for(int i = 0; i < arr.size(); i++) System.out.print(arr.get(i) + " ");
            System.out.println();
            // For Each Loop
            for(var x : arr) System.out.print(x + " ");
            System.out.println();
            // Iterator Using While Loop
            Iterator<Integer> it = arr.iterator();
            while(it.hasNext()) {
                System.out.print(it.next() + " ");
            }
            System.out.println();
            // Iterator Using For Loop
            for(Iterator<Integer> it2 = arr.iterator(); it2.hasNext();)
            {
                System.out.print(it2.next() + " ");
            }
            System.out.println();
            // For Each Loop Lambda Expression
            arr.forEach(n->System.out.print(n + " "));
            System.out.println();
        }
}
