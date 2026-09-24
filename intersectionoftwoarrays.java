class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i=0;i<nums1.length;i++)
       {
        set.add(nums1[i]);
       }
       HashSet<Integer> results = new HashSet<Integer>();
       for(int i=0;i<nums2.length;i++)
       {
        if(set.contains(nums2[i]))
        {
            results.add(nums2[i]);
        }
       } 
       int ans[]=new int[results.size()];
       int k=0;
       for(int x:results)
       {
       ans[k]=x;
       k++;

       }
       return ans;
    }
}