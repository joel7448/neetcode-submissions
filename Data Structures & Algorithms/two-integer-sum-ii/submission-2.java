class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
       
       // nums sorted in asc
       int i = 0; 
       int j = numbers.length - 1;
       while( i < j )
       {
        int summ = numbers[i]+numbers[j];
        if(summ == target)
        {
            return new int[] {i+1, j+1};
        }
        else if(summ < target)
        {
            i++;
        }
        else
        {
            j--;
        }
       }
       return new int[] {};
    }
}
