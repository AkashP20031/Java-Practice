package RecursionExample;

public class Challenge3 {

    public static int addArray(int[] a, int n)
    {
        if (n<=0)
            return 0;
        return a[n-1] + addArray(a,n-1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,8};
        System.out.println(addArray(a,a.length));
    }
}
