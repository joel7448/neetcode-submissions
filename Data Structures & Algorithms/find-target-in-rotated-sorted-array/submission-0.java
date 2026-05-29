class Solution {
    private int bs(int[] nums, int target, int l , int r)
    {
        while( l <= r)
        {
            int mid = l + ( r - l ) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot = 0;
        int l = 0 , r = nums.length-1;
        while( l < r )
        {
            int mid = l + ( r - l ) / 2;
            if(nums[mid] > nums[r])
            {
                // right portion is sorted move left
                l = mid + 1;
            }
            else 
            {
                // move to left
                r = mid;
            }
            
        }
        pivot = l;
        
        int res = bs(nums, target, 0 , pivot-1);

        if(res != -1)
        {
            return res;
        }

        return bs(nums, target, pivot, nums.length-1);
        
    }
}
