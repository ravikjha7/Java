package MultiThreadingIntro;

// Constructors
// Thread()
// Thread(Runnable r)
// Thread(Runnable r, String name)
// Thread(String name)
// Thread(ThreadGroup g, String name)

class MyRun implements Runnable {
    @Override
    public void run() {

    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        // To Give Name To Thread Of Our Own Class
        super(name);

        // To Set The Priority Of A Thread
        setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run() {
        int i = 1;
        while(i < 1000) {
            System.out.println(i++);
            try {
                Thread.sleep(10);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {

//        Thread t = new Thread();
//        Thread t2 = new Thread("MineThread");
//        Thread t3 = new Thread(new MyRun());
//        Thread t4 = new Thread(new MyRun(), "MyThread");

        MyThread t5 = new MyThread("Ravi");

        t5.setDaemon(true); // If a thread is set to Deamon, then it will end as soon as Parent Thread Is Over

        t5.start();

        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join(); // If join function is used on a thread, then it will wait for other threads to end
        } catch(Exception e) {

        }

        Thread.yield(); // If a yield function is used on a Thread, then The Thread allows other thread to work for more time


        // t5.interrupt(); // Will Interrupt The Thread (Stop Doing Work Of Thread)

        // Methods Of Thread Class
//        System.out.println(t5.getId());
//        System.out.println(t5.getName());
//        System.out.println(t5.getPriority());
//        System.out.println(t5.getState());
//        System.out.println(t5.isAlive());

    }
}
