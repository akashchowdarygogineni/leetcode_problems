class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        int[] newarr=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else if(arr[i]+arr[j]==target)
                {
                    newarr[0]=i;
                    newarr[1]=j;
                    break;

                }

            }
        }
        return newarr;
    }
}