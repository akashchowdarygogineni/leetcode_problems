class Solution {
    public int reverse(int x) {
        
        long rev=0;

       boolean flag=false;
       if(x<0)
       {
        x=Math.abs(x);
        flag=true;
       }
        while(x>0)
        {
           int rem=x%10;
           rev=(rev*10)+rem;
           x=x/10;
        }

        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        {
            return 0;
        }

        if(flag==false)
        {
            return (int)rev;
        }
        return -(int)rev;
    }
}