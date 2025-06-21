package MultiThreading;

class Hello extends Thread {
    public void run()
    {
        for(int i =0; i<10; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

 class World extends Thread {
    public void run()
    {
        for(int i =0; i<10; i++)
        {
            System.out.println("World");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class ThreadClass {
    public static void main(String[] args) {
         Hello h = new Hello();
         World w = new World();
         h.start();
         w.start();
    }
}
