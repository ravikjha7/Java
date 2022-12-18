import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Add Element At Front (Special Value Waala)
        dq.offerFirst(7);
        // Add Element At Front (Exception Waala)
        dq.addFirst(3);
        // Add Element At Last (Exception Waala)
        dq.addLast(8);
        // Add Element At Last (Special Value Waala)
        dq.offerLast(99);
        // Remove First Element (Special Value Waala)
        dq.pollFirst();
        // Remove First Element (Exception Waala)
        dq.removeFirst();
        // Remove Last Element (Special Value Waala)
        dq.pollLast();
        // Remove Last Element (Exception Waala)
        dq.removeLast();

        dq.forEach(n-> System.out.print(n + " "));
        System.out.println();
    }
}
