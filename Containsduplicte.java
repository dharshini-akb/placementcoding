import java.util.*;
public class containsduplicate {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<Integer>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
        }
        for(int x:set)
        {
            System.out.print(x+" ");
        }
    }
} 
}
