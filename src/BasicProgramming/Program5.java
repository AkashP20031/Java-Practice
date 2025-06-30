package BasicProgramming;
import java.util.Scanner;

//sum of digits in a number
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0)
        {
            sum = sum + num%10;
            num = num / 10;
        }
        System.out.println("Sum of Digits in number : "+sum);
    }
}
