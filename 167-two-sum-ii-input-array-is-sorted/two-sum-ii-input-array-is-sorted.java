class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        int left=0;
        int right=nums.length-1;

        int[] newarr={-1,0};
        

        while(left<right)
        {
            if(nums[left]+nums[right]<target)
            {
              left++;
            }
            else if(nums[left]+nums[right]>target)
            {
                right--;
            }
            else{
                newarr[0]=left+1;
                newarr[1]=right+1;
                return newarr;
            }
        }
        return newarr;
    }
}