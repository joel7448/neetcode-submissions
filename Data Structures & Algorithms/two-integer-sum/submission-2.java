class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> compliment = new HashMap<>();

      for(int i = 0 ; i < nums.length; i++)
      {
        int diff = target - nums[i];
        if(compliment.containsKey(diff))
        {
            return new int[]{ compliment.get(diff), i };
        }
        compliment.put(nums[i], i);
      }
      return new int[]{};
    }
}
