package BasicProgramming;
import java.util.Scanner;
//Check number is prime or not
public class Program7 {

    static boolean isPrime(int n)
    {
        int count = 0;
        if(n>0) {
            for (int i = 1; i<=n ;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            return count == 2;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(isPrime(n))
        {
            System.out.println("The number is Prime");
        }
        else
        {
            System.out.println("The number is not a prime");
        }
    }
}
