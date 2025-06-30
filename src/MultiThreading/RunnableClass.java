package MultiThreading;

class MyHello implements Runnable {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyWorld implements Runnable {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("World");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableClass {
    public static void main(String[] args) {
        MyHello h = new MyHello();
        MyWorld w = new MyWorld();
        Thread t1 = new Thread(h);
        Thread t2 = new Thread(w);
        t1.start();
        t2.start();
    }
}
