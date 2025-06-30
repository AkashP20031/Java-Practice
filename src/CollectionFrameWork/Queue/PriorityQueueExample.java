package CollectionFrameWork.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(80);
        priorityQueue.add(60);
        priorityQueue.add(5);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }
}
