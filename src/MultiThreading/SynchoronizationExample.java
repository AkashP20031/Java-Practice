package MultiThreading;

class Counter {
     int count = 0;

     synchronized int increment() {
         return count++;
     }

 }
class NumIncrement extends Thread
    {
        Counter counter;

        public NumIncrement(Counter counter) {
            this.counter = counter;
        }
        public void run()
        {
            for (int i=0;i<10;i++)
            {
                counter.increment();
            }
        }
    }

public class SynchoronizationExample {
        public static void main(String[] args) throws InterruptedException {
            Counter counter = new Counter();
            NumIncrement n1 = new NumIncrement(counter);
            NumIncrement n2 = new NumIncrement(counter);
            n1.start();
            n2.start();
            n1.join();
            n2.join();
            System.out.println("Final Count: " + counter.count);
        }


}
