package ExceptionHandling.ChallengeOnStackException;

public class StackException {
    public static void main(String[] args) throws Exception {
        stack s = new stack(5);
        s.push(2);
        s.push(3);
        s.push(2);
        s.push(2);
        s.push(2);

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();


    }
}
