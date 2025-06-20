public class RegularExpression {
    public static void main(String[] args) {
        String str = "31/2/2009";
        System.out.println(str.matches("[0-3][1-9]/[0-12]/[0-9]{4}"));
    }
}
