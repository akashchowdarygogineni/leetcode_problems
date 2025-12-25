class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int[] arr=new int[nums.size()];
        int k=0;
        for(int i:nums)
        {
            arr[k]=i;
            k++;
        }

        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else if(arr[i]+arr[j]<target)
                {
                   count++;

                }

            }
        }
        return count;
    }
}