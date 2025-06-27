package BasicArrayPrograms;
import java.util.Scanner;
//Sum of elements in an array
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter the index no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array numbers :");
        for (int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of the Array numbers : "+sum);
    }
}
