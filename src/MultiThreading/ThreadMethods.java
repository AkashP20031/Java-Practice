package MultiThreading;

class MyThread extends Thread
{
     public MyThread(String name)
    {
        super(name);
        setPriority(MAX_PRIORITY);
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        System.out.println(t.getId());
        System.out.println(t.getName());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());
    }
}
