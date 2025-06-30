package Thread;

public class ThreadExample {
    public static void main(String[] args) {
         Hi h = new Hi();
         h.start();
         Hello he = new Hello();
         he.start();
    }
}
