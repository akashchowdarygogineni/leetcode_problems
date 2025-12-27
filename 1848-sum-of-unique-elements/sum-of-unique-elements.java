class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }


        Set<Integer> k=map.keySet();

        int sum=0;
        for(int j:k)
        {
            if(map.get(j)==1)
            {
            sum+=j;
            }
        }
        return sum;
    }
}