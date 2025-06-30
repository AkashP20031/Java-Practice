package BasicArrayPrograms;
//Find the Duplicate numbers in Array
public class Program4 {
    public static void main(String[] args) {
        int[] a = {1,5,8,9,5,4,3,1,2,9,7,8};
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j])
                {
                    System.out.println("Element "+a[i]+" is duplicate element");
                    flag=false;
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("No duplicate elements");
        }
    }
}
