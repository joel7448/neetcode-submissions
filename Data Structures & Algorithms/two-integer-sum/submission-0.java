class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tracer = new HashMap();
        for( int i = 0; i < nums.length; i++)
        {
            if(tracer.containsKey(target - nums[i]))
            {
                return new int[] {tracer.get(target - nums[i]), i};
            }
            tracer.put(nums[i],i);
            
        }
        return new int[] { 0, 0 };
        
    }
}
