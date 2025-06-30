package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9,8,5,3,6,2,4,7};
        System.out.println("Before sorting : ");
        for (int i : a)
        {
            System.out.print(" "+i);
        }
        for (int j = 0; j < a.length-1; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
//            System.out.println();
//            for (int i : a)
//            {
//                System.out.print(" "+i);
//
//            }
        }
        System.out.println("\nAfter Sorting : ");
        for (int i : a)
        {
            System.out.print(" "+i);
        }
    }
}
