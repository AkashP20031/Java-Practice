package BasicProgramming;
//reversing a string
public class Program3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String rev = "";
        for (int i = str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
