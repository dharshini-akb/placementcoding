import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()
);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
            {
                q.offer(arr[i]);
                if(q.size()>k)
                {
                    q.poll();
                }
            }
        System.out.println(q.peek());
            }
}