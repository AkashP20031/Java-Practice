package CollectionFrameWork.Sets;

import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(10,50,40,10,80,60,90));
        treeSet.add(25);
        System.out.println(treeSet);
    }
}
