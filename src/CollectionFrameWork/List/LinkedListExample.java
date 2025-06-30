package CollectionFrameWork.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>(List.of(25,27,29));
        linkedList.add(20);
        linkedList.add(23);
        linkedList.add(26);
        linkedList.add(28);
        linkedList.addAll(2,linkedList1);

        linkedList.addLast(100);
        linkedList.addFirst(10);
        System.out.println(linkedList);

        linkedList.remove(2);
        for (int x : linkedList)
        {
            System.out.println(x);
        }
    }
}
