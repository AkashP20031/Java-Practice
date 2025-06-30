package CollectionFrameWork.Maps;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"manju");
        linkedHashMap.put(2,"narayan");
        linkedHashMap.put(3,"akash");
        linkedHashMap.put(4,"anand");
        System.out.println(linkedHashMap);
        linkedHashMap.remove(1);
        System.out.println(linkedHashMap);
        linkedHashMap.replace(4,"manoj");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(3));

    }
}
