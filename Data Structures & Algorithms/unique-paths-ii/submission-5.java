class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] paths = new int[n];
        paths[0] = 1;
        // Arrays.fill(paths, 1);

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(obstacleGrid[i][j] > 0)
                {
                    paths[j] = 0;
                }
                else if(j > 0)
                {
                    paths[j] = paths[j] + paths[j-1];
                }
            }
        }

        return paths[n-1];
    }
}