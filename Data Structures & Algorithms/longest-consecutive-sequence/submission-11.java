class Solution {
    private int bruteForceSolution(int[] nums)
    {
        Set<Integer> store = new HashSet<>();
        int res = 0;

        for(int num : nums)
        {
            store.add(num);
        }

        for(int num  : nums)
        { 
            int streak = 0;
            int curr = num;
            while(store.contains(curr))
            {            
                curr++;
                streak++;
            }

            res = Math.max(res,streak);
        }
        return res;
    }

    public int betterSolution(int[] nums)
    {
        if(nums.length == 0) return 0;
        Arrays.sort(nums); // [2, 3, 4, 4, 5, 10, 20]
        int res = 0;
        int i = 0 ;
        int curr = nums[0];
        int streak = 0;
        while(i < nums.length)
        {
            if(nums[i] != curr)
            {
                curr = nums[i];
                streak= 0;
            }
            while( i < nums.length && nums[i] == curr)
            {
                i++;
            }
            streak++;
            curr++;

            res = Math.max(streak, res);
        }
        return res;
    }
    private int optimalSolution (int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        int streak = 0;
        for(int n : nums)
        {
            set.add(n);
        }

        for(int i = 0; i<nums.length; i++)
        {   int curr = nums[i];
            if(!set.contains(curr - 1))
            {
                int length = 1;
                while( set.contains(curr+length) )
                {
                    length+=1;
                }
             streak = Math.max(length, streak);
            }
        }
        return streak;
    }
    public int longestConsecutive(int[] nums) {
       
        // return bruteForceSolution(nums);   
        // return betterSolution(nums);
        return optimalSolution(nums);
    }
}
// [2,20,4,10,3,4,5]
// [2,3,4,4,5,10,20]
//             i j
// curr = 4 ; streak = 4