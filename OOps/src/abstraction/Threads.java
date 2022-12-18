package abstraction;

class NewThread extends Thread {
    void display() {
        System.out.println("Using Another Thread !!!");
    }
}

public class Threads {
    public static void main(String[] args) {
        System.out.println("Inside The Main Thread !!!");
        NewThread nt = new NewThread();
        nt.start();
        nt.display();
    }
}
