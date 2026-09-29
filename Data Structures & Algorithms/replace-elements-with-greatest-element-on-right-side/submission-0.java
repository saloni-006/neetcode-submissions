class Solution {
    public int[] replaceElements(int[] arr) {
        int maxright=-1;
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--)
        {
           ans[i]=maxright;
           maxright = Math.max(maxright,arr[i]);
        }

         return ans;
    }
   
}