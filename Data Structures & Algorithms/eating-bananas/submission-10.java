class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int limit = 0;
        for(int pile: piles)
        {
            limit = Math.max(limit, pile);
        }
        System.out.println(limit);
        int l = 1 , r = limit;
       
        while(l < r) 
        {
            long t = 0;
            int mid = l + (r - l) / 2;
             for( int pile : piles )
                {
                    t += (pile + mid - 1) / mid;

                }

                if( t > h  )
                {
                    l = mid + 1;
                }
                else if ( t <= h )
                {
                    r = mid;
                }
        }
        return r;
        
        //  for(int k = 1 ; k <= limit; k++)
        // {
        //     long t = 0;
        // for(int i=0; i < piles.length; i++)
        // {
        //     t += (piles[i] + k - 1) / k;

            
        // }
        //  if(t <= h)
        //  {
        //     return k;
        //  }   
        // }

    //    return 0;
        
    }
}
