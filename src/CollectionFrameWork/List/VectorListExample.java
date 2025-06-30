package CollectionFrameWork.List;

import java.util.Collections;
import java.util.Vector;

public class VectorListExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("dog");
        vector.add("cat");
        vector.add("horse");
        vector.add("cow");
        System.out.println(vector);
        Collections.sort(vector);
        System.out.println(vector);
        vector.add("zebra");
        vector.remove("cat");
        System.out.println(vector);
        vector.set(2,"monkey");
        System.out.println(vector);
        int count = 0;
        for (String name : vector)
        {
            System.out.println(name);
            count++;
        }
        System.out.println("No of Names in vector List : "+count);
    }
}
