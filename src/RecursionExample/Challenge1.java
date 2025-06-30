package RecursionExample;

public class Challenge1 {

    public static int addition(int a)
    {
        if (a<=0)
            return 0;
        return a+ addition(a-1);
    }

    public static void main(String[] args) {
        System.out.println(addition(3));
    }
}
