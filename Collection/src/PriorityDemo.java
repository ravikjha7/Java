import java.util.*;
// Comparator For Implementing Max Heap
class MyCom implements Comparator<Integer>{
    public int compare(Integer f,Integer s)
    {
        if(f < s) return 1;
        if(s < f) return -1;
        return 0;
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        // It Follows min heap i.e Larger Element -> Smaller Priority
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // By Using Comparator, We can Use Our Own Priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());

        // To Add Elements In Priority Queue
        pq.add(7);
        pq.offer(3);
        pq.add(8);
        pq.add(99);

        // To Print First Element
        System.out.println(pq.peek());

        // Deletion Of First Element
        pq.poll();

        // Iteration
        pq.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
