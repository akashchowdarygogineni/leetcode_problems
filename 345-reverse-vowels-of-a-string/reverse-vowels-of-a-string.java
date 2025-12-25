class Solution {

    public static boolean isvowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
   
    public String reverseVowels(String s) {
        

        char[] arr=s.toCharArray();

        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            char ch=arr[left];
            char ch1=arr[right];

            if(isvowel(ch) && isvowel(ch1))
            {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(isvowel(ch)==false && isvowel(ch1)==false)
            {
                left++;
                right--;
            }
            else if(!isvowel(ch))
            {
                left++;
            }
            else if(!isvowel(ch1))
            {
                right--;
            }
        }

        return new String(arr);
    }
}