public class SynchronisationDemo {
    static class MyData {

        // synchronised basically makes it a critical section where other thread is not allowed to enter
        // Two ways

        // 1st)
        void display(String s) {
            synchronized (this) {
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(s.charAt(i));
                }
                System.out.println();
            }
        }

        // 2nd)
//        synchronized void display(String s) {
//            for(int i = 0; i < s.length(); i++) {
//                System.out.print(s.charAt(i));
//            }
//            System.out.println();
//        }
    }

    static class MyThread1 extends Thread {
        MyData md;
        MyThread1 (MyData d) {
            md = d;
        }

        @Override
        public void run() {
            md.display("Hello World  llaksjsjallljaajoasojsoasjsjsajsoaosos!!!");
        }
    }

    static class MyThread2 extends Thread {
        MyData md;
        MyThread2 (MyData d) {
            md = d;
        }

        @Override
        public void run() {
            md.display("Welcome abhijit omkar vishal nilay saurabh pratham parth!!!");
        }
    }

    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t.start();
        t2.start();
    }
}
