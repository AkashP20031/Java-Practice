package BasicArrayPrograms;
//Find max and min number in an Array
public class Program3 {
    public static void main(String[] args) {
        int[] a = {5,8,7,9,4,6,2};
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
          if(a[i]>max)
          {
              max = a[i];
          }
          if(a[i]<min)
          {
              min = a[i];
          }
        }
        System.out.println("Maximum Number is : "+max+"\nMinimum Number is : "+min);
    }
}
