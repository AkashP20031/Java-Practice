package InnerClass;


public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousInner A = new AnonymousInner() {
            @Override
            void display() {
                System.out.println("It is AnonymousInner Class");
            }
        };
        A.display();

        }
    }

