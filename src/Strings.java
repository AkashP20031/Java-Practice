public class Strings {
    public static void main(String[] args) {
        char c[] = { 'A','B','C'};
        String str = new String(c);
        System.out.println(str);
        for (char i :str.toCharArray())
        {
            System.out.println(i);
        }

    }
}
