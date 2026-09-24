import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
            {
                arr2[i]=sc.nextInt();
                set.add(arr2[i]);
            }
        System.out.print(set);
    }
}