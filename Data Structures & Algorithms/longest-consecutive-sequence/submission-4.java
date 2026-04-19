class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int curr = nums[0] , res = 0 , streak = 0 , i = 0;

        

        while(i < nums.length)
        {
            // streak break 
            if(curr != nums[i])
            {
                streak = 0 ;
                curr = nums[i];
            }
            while( i < nums.length && curr == nums[i])
            {
                i++;
            }
            curr++;
            streak++;
            res = Math.max(streak,res);

        

        }
        return res;
    }
}
// [2,20,4,10,3,4,5]
// [2,3,4,4,5,10,20]
//             i j
// curr = 4 ; streak = 4