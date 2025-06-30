package CollectionFrameWork.Sets;

import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(List.of(10,50,40,80,60,90));
        hashSet.add(25);
        System.out.println(hashSet);
        hashSet.remove(40);
        System.out.println("After "+hashSet);
    }
}
