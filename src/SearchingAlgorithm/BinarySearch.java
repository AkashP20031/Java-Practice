package SearchingAlgorithm;

public class BinarySearch {
    public static boolean binarySearch(int[] a, int key)
    {
        int low = 0;
        int high = a.length-1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if(key == a[mid])
            {
                return true;
            }
            if(key < a[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int[] a = {1,2,4,5,6,8,9};
         int key = 6;
        if(binarySearch(a,key))
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
