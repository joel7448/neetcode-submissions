class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> track = new HashMap<>();

       for(int i = 0 ; i < nums.length ; i++)
       {
        int key = target - nums[i];

        if(track.containsKey(key))
        {
            return new int[] { track.get(key) ,  i};
        }

        track.put(nums[i], i);
       }

       return new int[] {};
    }
}
