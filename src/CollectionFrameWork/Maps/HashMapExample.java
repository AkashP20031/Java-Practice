package CollectionFrameWork.Maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Akash");
        hashMap.put(2,"Manoj");
        hashMap.put(3,"Manju");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        hashMap.remove(3);
        System.out.println(hashMap);
    }
}
