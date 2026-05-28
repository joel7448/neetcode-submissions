class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Staircase search

        int m = matrix.length;
        int n = matrix[0].length;

        int  top = 0 , bot = m - 1;
        int row = 0;
        // finding row
        while( top < m && bot >= 0 )
        {
            row = ( top + bot ) / 2;

            if(matrix[row][0] > target)
            {
               
                 bot = bot - 1;
            }
            else if(matrix[row][ n - 1] < target)
            {
                top = top + 1;
            }
            else 
            { break; }
        }

        int l = 0 , r = n - 1;
        System.out.println(row);
        while( l <= r)
        {
            int mid = l + ( r - l ) / 2;
            if(matrix[row][mid] == target)
            {
                return true;
            }
            else if(matrix[row][mid] < target )
            {
                    l = mid + 1;
            }
            else
            {
                r = mid - 1 ;
            }
        }
        return false;

        


    } 
}
