class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0 , bottom = m-1;
        int row = 0;
        while( top <= bottom )
        {
            row = (top + bottom) / 2;
            if(matrix[row][0] > target)
            {
                bottom  = row - 1;
            }
            else if(matrix[row][n-1] < target)
            {
                top = row + 1;
            }
            else{
                break;
            }
        }
        
        if(top > bottom)
        {
            return false;
        }
        System.out.println(row);
        int l = 0 , r = n - 1;
        while( l <= r )
        { 
            int mid = l + ( r - l ) / 2;
            if(matrix[row][mid] == target)
            {
                return true;
            }
            else if(matrix[row][mid] < target)
            {
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return false;
    } 
}
