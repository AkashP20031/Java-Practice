package ExceptionHandling.ChallengeOnStackException;

public class stack {
        private int size;
        private int top =-1;
        private int S[];
        public stack(int sz)
        {
            size = sz;
            S = new int[sz];
        }

        public void push(int n) throws Exception
        {
            if(top==size-1)
                throw new StackOverFlow();
            top++;
            S[top] = n;
        }
        public int pop() throws Exception
        {
            int x = -1;
            if(top<0)
                throw new StackUnderFlow();
            x=S[top];
            top--;
            return x;
        }

}
