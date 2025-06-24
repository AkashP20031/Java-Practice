package CollectionFrameWork.Maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String > treeMap = new TreeMap<>();
        treeMap.put(1,"Dog");
        treeMap.put(6,"Cat");
        treeMap.put(3,"zebra");
        treeMap.put(2,"Fish");
        treeMap.put(5,"rabbit");
        treeMap.put(4,"cow");
        System.out.println(treeMap);
        treeMap.remove(4);
        System.out.println(treeMap);
        System.out.println(treeMap.size());
    }
}
