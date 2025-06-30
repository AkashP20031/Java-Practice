package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a ={4,7,6,8,2,3,9,5,1};
        int minIndex = 0;
        System.out.println("Before Sorting");
        for (int i : a)
        {
            System.out.print(" "+i);
        }
        for (int i = 0; i < a.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < a.length ; j++) {
                if(a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        System.out.println("\nAfter Sorting");
        for (int i : a)
        {
            System.out.print(" "+i);
        }
    }
}
