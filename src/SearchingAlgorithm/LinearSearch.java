package SearchingAlgorithm;

public class LinearSearch {
    public static void linearSearch(int[] arr , int key)
    {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
             if(key == arr[i])
             {
                 System.out.println("Key found at index "+i);
                 flag = true;
                 break;
             }
        }
        if(!flag)
        {
            System.out.println("Key Not found");
        }

    }
    public static void main(String[] args) {
        int[] a = {5,8,6,9,7,3,4};
        int key = 9;
        linearSearch(a,key);
    }
}
