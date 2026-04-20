class Solution {
    public int[] productExceptSelf(int[] nums) {
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
}  
