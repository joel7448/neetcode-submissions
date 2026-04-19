class Solution {
    public int longestConsecutive(int[] nums) {
       
        
        int res = 0 ,  length = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums)
        {
            numSet.add(num);
        }

        for(int num : numSet)
        {
            if(!numSet.contains(num-1))
            { 
                length = 1;
                while(numSet.contains(num+length))
                {
                    length++;
                }
            }
            res = Math.max(length , res);

        }
        return res;
    }
}
// [2,20,4,10,3,4,5]
// [2,3,4,4,5,10,20]
//             i j
// curr = 4 ; streak = 4