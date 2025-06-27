package BasicArrayPrograms;

public class SelectionSort {
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        public static void main(String[] args) {
            int[] arr = {55,24,78,99,21,12,2,3,1,56,7};
            System.out.println("Before sorting Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            selectionSort(arr);
            System.out.println("\n\nSorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

