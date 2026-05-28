class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int limit = 0;
        for(int pile: piles)
        {
            limit = Math.max(limit, pile);
        }
        System.out.println(limit);
         for(int k = 1 ; k <= limit; k++)
        {
            long t = 0;
        for(int i=0; i < piles.length; i++)
        {
            t += (piles[i] + k - 1) / k;

            
        }
         if(t <= h)
         {
            return k;
         }   
        }

       return 0;
        
    }
}
