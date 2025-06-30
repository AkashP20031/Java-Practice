package BasicArrayPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,5,9,7,3,2,6,8,4};
        int key = 7;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if(key == a[i])
            {
                System.out.println("Element "+key+" Fount at Index "+i);
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Element is not in the array");
        }
    }
}
