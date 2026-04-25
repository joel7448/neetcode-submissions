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
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = 1; //[1, 0, 0, 0]
        suffix[nums.length-1] = 1; //[0, 0, 0, 6]
        for(int i = 1; i < nums.length; i++)
        {
            prefix[i] = nums[i-1]*prefix[i-1]; // [1 ,2, 8, 48]
        }

        for(int i=nums.length-2; i>=0 ; i--)
        {
            suffix[i] = nums[i+1]*suffix[i+1]; // [ 48 ,48,24, 6 ]
        }

        for(int i=0 ; i < nums.length; i++)
        {
            
            result[i] = prefix[i]*suffix[i];
        }

        return result;
    }
}  
