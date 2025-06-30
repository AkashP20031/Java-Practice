package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(20,30,50,60,90,70,140,120));
        arr.add(10);
        arr.add(100);
//        arr.addAll(arr1);
        arr.addAll(1, arr1);
        System.out.println(arr);
        for (int x : arr)
        {
            System.out.println(x);
        }
    }
}
