package BasicProgramming;
import java.util.Scanner;
//To check the number is palindrome or not
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while (n!=0)
        {
            reverse = reverse * 10 + n % 10;
            n = n/10;
        }
        if(temp == reverse)
        {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The Number is not palindrome");
        }
    }
}
