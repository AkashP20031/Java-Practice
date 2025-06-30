package CollectionFrameWork.Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(20);
        arrayDeque.offer(30);
        arrayDeque.offer(40);
        arrayDeque.add(50);
        arrayDeque.add(60);
        arrayDeque.offerFirst(10);
        arrayDeque.offerLast(70);
        System.out.println(arrayDeque);
        arrayDeque.remove(20);
        System.out.println(arrayDeque);
        for (int x : arrayDeque)
        {
            System.out.println(x);
        }
    }
}
