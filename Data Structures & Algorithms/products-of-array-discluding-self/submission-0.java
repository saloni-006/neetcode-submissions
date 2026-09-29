class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] output=new int[nums.length];
      int leftproduct=1;
        int rightproduct=1;
      //product of leftg side
      for(int i=0;i<nums.length;i++)  
      {
        
        output[i]=leftproduct;
        leftproduct=leftproduct*nums[i];
      }

      for(int i=nums.length-1;i>=0;i--)
      {
      
        output[i]=output[i]*rightproduct;
        rightproduct=rightproduct*nums[i];
      }

      return output;
    }
}  
