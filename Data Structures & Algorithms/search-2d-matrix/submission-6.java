class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Staircase search

        int m = matrix.length;
        int n = matrix[0].length;

        int p1 = 0 , p2 = n - 1;
        while( p1 < m   && p2 >= 0 )
        {
            if(matrix[p1][p2] < target)
            {
                p1+=1;
            }
            else if(matrix[p1][p2] > target)
            {
                p2 -= 1;
            }
            else
            {
                return true;
            }            
        }

        return false;


    } 
}
