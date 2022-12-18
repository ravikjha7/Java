import java.util.Scanner;

class StackOverFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack Overflow !!!";
    }
}

class StackUnderFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack Underflow !!!";
    }
}

class Stack {
    private int size;
    private int top = -1;
    private int arr[];
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int data) throws Exception {
        if(top == size - 1) throw new StackOverFlowException();
        top++;
        arr[top] = data;
    }

    int pop() throws Exception {
        if(top == -1) throw new StackUnderFlowException();
        return arr[top--];
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        try {
            s.push(7);
            s.push(3);
            s.push(99);
            s.push(69);
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
