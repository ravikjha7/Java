package MultiThreadingIntro;

// Multi Threading Can Be Achieved Using Two Methods :
// 1) Thread Class
// 2) Runnable Interface

// Run is The Starting Point Of A Thread

class RunnableDemo implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while(i < 1000) {
            System.out.println("World !!!");
            i++;
        }
    }
}

// We have to extend Thread Class
public class Intro extends Thread {

    // Whatever Code we will write inside run method, will be executed by the thread when start function will be called
    public void run() {
        int i = 1;
        while(i < 1000) {
            System.out.println("World !!!");
            i++;
        }
    }

    public static void main(String[] args) {

        // Create New Object Of The Class Extending Thread Class
//        Intro in = new Intro();
//        // Call The Start Method
//        in.start();

        // Create new Object Of The Class Implementing Runnable Interface
        RunnableDemo rd = new RunnableDemo();
        Thread t = new Thread(rd);
        t.start();

        int i = 1;
        while(i < 1000) {
            System.out.println("Hello !!!");
            i++;
        }

    }
}
