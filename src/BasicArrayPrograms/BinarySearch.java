package BasicArrayPrograms;
public class BinarySearch {
    public static boolean binarySearch(int[] a,int key)
    {
        int low = 0;
        int high = a.length-1;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(key == a[mid])
            {
                return true;
            }
            if(key>a[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90};
        int key = 50;
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
