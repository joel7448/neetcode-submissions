class Solution {
    private int[] division(int[] nums)
    {
         int[] res = new int[nums.length];
        // Division method
        int zero_cnt = 0;
        int product = 1;
        for (int numb : nums)
        {
            if(numb == 0)
            {
                zero_cnt++;
            }

            else {
                product *= numb;
            }
        }

        if(zero_cnt > 1)
        {
            return res;
        }

        for(int i=0 ; i < nums.length; i++)
        {
            if(zero_cnt > 0 )
            {
                if(nums[i] == 0)
                {
                    res[i] = product;
                }
                else{
                    res[i] = 0;
                }
            }
            else{
                res[i] = product / nums[i];
            }
        }
        return res;

    }
    public int[] productExceptSelf(int[] nums) {
      int[] res = new int[nums.length];

      int[] prefix = new int[nums.length]; // [1, 1,  ]
      prefix[0] = 1;
      for(int i = 1; i < nums.length; i++)
      {
        prefix[i] = prefix[i-1] * nums[i-1];
      }
      
        int suffix = 1;
      for(int i = nums.length-1; i >= 0; i-- )
      {
        res[i] = suffix * prefix[i];
        suffix *= nums[i];
      }

      return res;
    }
}  
