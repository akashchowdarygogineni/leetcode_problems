class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         
        int[] newarr=new int[nums.length];
        int even=0;
        int odd=newarr.length-1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
           {
             newarr[even]=nums[i];
             even+=2;
           }
           else{
             newarr[odd]=nums[i];
             odd-=2;
            
           }
        }
        return newarr;
    }
}