public class StringMethods {
    public static void main(String[] args) {
        String str = "Java Programming";
        String str2 = "Java";
        String str1 = "Java";
        int length = str.length();
        System.out.println("length : " +length);
        System.out.println(str.charAt(0));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,6));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("g"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.equals(str));
        System.out.println(str2==str1);
        System.out.println(str1.equals(str2));
        System.out.println(str.strip());
        System.out.println(str2.compareTo(str1));
        String a="abc";
        String b=new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
}
