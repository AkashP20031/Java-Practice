package ArraysExample;

public class Challenge1 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int sum = 0;

        for(int num : a)
        {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
