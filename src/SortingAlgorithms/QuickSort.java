package SortingAlgorithms;

public class QuickSort {
    public static int part(int[] a, int low, int high)
    {
        int pi = a[high];
        int j = low-1;
        for (int i = low; i < high; i++) {
            if(a[i] < pi)
            {
                j++;
                swap(a,j,i);
            }
        }
        swap(a,j+1,high);
        return j+1;
    }
    public static void quickSort(int[] a, int low, int high)
    {
        if (low<high) {
            int pivot = part(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }

    }
    public static void swap(int arr[], int i , int j )
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] a ={9,8,7,5,6,4,3,1,2};
        int high = a.length-1;
        int low = 0;
        System.out.println("Before Sorting");
        for (int i : a)
        {
            System.out.print(" "+i);
        }
        quickSort(a,low,high);
        System.out.println("\nAfter Sorting");
        for (int i : a)
        {
            System.out.print(" "+i);
        }
    }
}
