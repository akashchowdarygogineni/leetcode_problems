class Solution {
    public int removeDuplicates(int[] arr) {
        
        //remove the duplicates from the sorted array 2

        if(arr.length<=2)
        {
            return arr.length;
        }

        int i=1;

        for(int j=2;j<arr.length;j++)
        {
            if(arr[j]!=arr[i-1])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}