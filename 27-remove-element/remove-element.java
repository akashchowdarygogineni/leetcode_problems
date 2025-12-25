class Solution {
    public int removeElement(int[] arr, int val) {
               
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                j=i;
                break;
            }
        }

        if(j==-1)
        {
           return arr.length;
           
        }



        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }

   
 
    

}